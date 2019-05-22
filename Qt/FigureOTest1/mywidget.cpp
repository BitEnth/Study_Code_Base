#include "mywidget.h"
#include "ui_mywidget.h"
#include <QDebug>
#include <stdio.h>
#include <string.h>

MyWidget::MyWidget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::MyWidget)
{
    ui->setupUi(this);
    QString str = "ffd8f fe04344\n4\n 54";
    str = str.simplified();
    str.remove(" ");
    int len = str.length()/2;
    qDebug() << str.length() << len;
    char c[len];
    qstr2char(c, str, len);
    ui->txtHex->setText(QString(c));
    ui->txtHex->append("293189");
    ui->txtHex->append("askdj");
    FILE *fp;
    char ch[7];
    fp = fopen("test1.txt", "a+");
    if(fp == nullptr){
        qDebug() << "??????";
    }
    else{
        fread(ch, sizeof (ch), 7, fp);
        fclose(fp);
    }
//    while(!feof(fp)){
//        ulong count = fread(ch, sizeof(char), 7, fp);
//        qDebug() << count;
//    }
    ui->txtChar->setText(ch);
}

MyWidget::~MyWidget()
{
    delete ui;
}


int MyWidget::qstr2char(char *c, QString qstr, int len_c)
{
    int i_temp;
    QString qstr_temp;
    for(int i = 0;i < len_c;i++){
        qstr_temp = qstr.left(2);
        ui->txtChar->append(qstr_temp);
        i_temp = qhex2char(qstr_temp);
        c[i] = (char)(i_temp);
        qstr = qstr.remove(0, 2);
    }
    return 0;
}
/*
 * the length of qstr must be 2
*/
int MyWidget::qhex2char(QString qstr)
{
    int i_high, i_low, i_char;
    QString qstr_subh, qstr_subl;
    qstr_subl = qstr.right(1);
    qstr.chop(1);
    qstr_subh = qstr;
    i_high = qstrhexswitch(qstr_subh);
    i_low = qstrhexswitch(qstr_subl);
    i_char = i_high*16 + i_low;
    return i_char;
}
/*
 * ASCII
 * 0-9: 48-57
 * a-f: 97-102
*/
int MyWidget::qstrhexswitch(QString qstr)
{
    char *ctemp = qstr.toUtf8().data();
    int i = *ctemp;
    if(i >= 48 && i <= 57){
        i = i-48;
    }else if (i >= 97 && i <= 102) {
        i = i-87;
    }else{
        return 63; // return '?'
    }
    return i;
}

void MyWidget::on_btnTransfer_clicked()
{
    QString str_hex = ui->txtHex->toPlainText();
    QByteArray qba1 = str_hex.toLocal8Bit();

}
