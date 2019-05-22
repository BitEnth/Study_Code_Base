#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QFileDialog>
#include <QDataStream>
#include <QFile>
#include <QFileInfo>
#include <QDebug>
#include <iostream>
#include <fstream>

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    ui->progressBar->setValue(0);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_openBtn1_clicked()
{
    int flag  = openFilepath();
    if(flag == 0){
        sw.show();
        sw.copypath(f_path);
        ui->label_img1->setPixmap(f_path);
        sw.readFile();
    }
    else{
        return;
    }

//    ui->progressBar->setRange(0, f_size);
//    ui->progressBar->setValue(sw.getProgress());

}

int MainWindow::char2int(char *c, int *i_arr, int len)
{
    for (int i = 0;i<len;i++) {
        i_arr[i] = int(c[i]);
    }
    return 0;
}

QString MainWindow::int2qstr(int *i_arr, int len)
{
    QString qstr;
    for (int i = 0;i < len;i++) {
        qstr += QString::number(i_arr[i]);
    }
    return qstr;
}

int MainWindow::qstr2char(char *c, QString qstr, int len_c)
{
    int i_temp;
    QString qstr_temp;
    for(int i = 0;i < len_c;i++){
        qstr_temp = qstr.left(2);
        i_temp = qhex2char(qstr_temp);
        c[i] = (char)(i_temp);
        qstr = qstr.remove(0, 2);
    }
    return 0;
}
/*
 * the length of qstr must be 2
*/
int MainWindow::qhex2char(QString qstr)
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
int MainWindow::qstrhexswitch(QString qstr)
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

int MainWindow::getCharLen(char *c)
{
    int len = sizeof(c)/sizeof(c[0]);
    return len;
}

int MainWindow::openFilepath()
{
    f_path = QFileDialog::getOpenFileName(this, "Open File", "../");
    if(f_path.isEmpty()){
        return 1;
    }
    return 0;
}

int MainWindow::getFilesize()
{
    QFileInfo f_info(f_path);
    f_size = f_info.size();
    return 0;
}


void MainWindow::on_btnSave_clicked()
{
    QString path_qstr = QFileDialog::getSaveFileName(this, "Save", "../");
    if(path_qstr.isEmpty()){
        return;
    }
//    FILE *file;
//    file = fopen(path_qstr.toStdString().data(), "a+");
//    QString strhex = sw.gettxtHex();
//    strhex = strhex.simplified();
//    int len = strhex.length();
//    qDebug() << len;
//    char c[len];
//    qstr2char(c, strhex, len);
//    qDebug() << c;
//    qDebug() << sizeof(c);
//    ulong flag = fwrite(c, sizeof(c), 1, file);
//    qDebug() << flag;
//    fclose(file);

    QFile file1(path_qstr);
    file1.open(QIODevice::WriteOnly);
    QDataStream qds(&file1);
    QString str1 = sw.gettxtHex();
    //str1 = str1.simplified();
    //str1.remove(" ");
    qDebug() << str1;
    int len = int(str1.length()/2);
    qDebug() << str1.length() << len;
    char c[len];
    qstr2char(c, str1, len);
    //not to use writebytes
    qds.writeRawData(c, len);
//    uint len_uint = static_cast<uint>(len);
//    qds.writeBytes(c, len_uint);
    file1.close();
}
