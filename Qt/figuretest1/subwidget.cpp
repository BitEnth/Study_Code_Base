#include "subwidget.h"
#include <QDebug>
#include <QFileInfo>

SubWidget::SubWidget(QWidget *parent) : QWidget(parent)
{
    txtHex_All.setParent(this);
    txtHex_Info.setParent(this);
    hlayout = new QHBoxLayout(this);
    hlayout->addWidget(&txtHex_All);
    hlayout->addWidget(&txtHex_Info);
    setLayout(hlayout);
}

int SubWidget::copypath(QString path_target)
{
    path_sub = path_target;
    return 0;
}

int SubWidget::readFile()
{
//    ifstream file2;
//    file2.open(path_sub.toStdString(), ios::binary);
//    char f_char[4096];
//    memset(f_char, 0, 4096);
//    QByteArray qba2;
//    progress = 0;
//    while(file2 >> f_char){
//        progress += sizeof (f_char);
//        txtHex_Info.append(QString(f_char));
//        QByteArray qba1 = QByteArray(f_char);
//        qba2 = qba1.toHex();
//        txtHex_All.append(qba2);
//    }
//    QFileInfo f_info(path_sub);
//    int f_size = static_cast<int>(f_info.size());
//    char c[f_size];
//    for(int i = 0;i < f_size;i++){
//        file2 >> c[i];
//    }
//    txtHex_All.setText(QString(c));
//    file2.close();
//    QString str_appn = txtHex_All.toPlainText();
//    strcut(&str_appn, "ffdb");
//    txtHex_Info.setText(str_appn);


//    FILE *file_read;
//    QFileInfo f_info(path_sub);
//    int f_size = static_cast<int>(f_info.size());
//    ulong size_f = static_cast<ulong>(f_info.size());
//    char c[f_size];
//    const char *path = path_sub.toStdString().data();
//    file_read = fopen(path, "ab+");
//    if(file_read == nullptr){
//        qDebug() << "??????";
//    }
//    else{
//        for(int i = 0; i < f_size; i++){
//            fread(&c[i], 2, 1, file_read);
//        }
//        fread(c, sizeof(char), size_f, file_read);
//        fclose(file_read);
//    }
//    QString str_read = QString(c);
//    qDebug() << str_read;
//    txtHex_All.setText(str_read);


//      QFile file1(path_sub);
//      QFile file_info(path_sub);
//      int f_size = static_cast<int>(file_info.size());
//      bool isOpen = file1.open(QIODevice::ReadOnly);
//      if(isOpen){
//        char c[f_size];
//        char *ctemp;
//        uint uni = static_cast<uint>(sizeof(char));
//        QString str;
//        QDataStream qds(&file1);
//        for(int i = 0;i < f_size;i++){
//            if(qds.readRawData(&c[i], sizeof(char)) == -1){
//                continue;
//            }
//            ctemp = &c[i];
//            qds.readBytes(ctemp, uni);
//        }
//        int i;
//        for(i = 0; i < f_size;i++){
//            qint64 readbytes = file1.read(&c[i], sizeof(char));
//            if(readbytes == -1){
//                break;
//            }else{
//                qDebug() << readbytes;
//            }
//        }
//        qDebug() << i;
//        str = QString(c);
//        txtHex_All.setText(str);
//     }
//     file1.close();
     return 0;
}

int SubWidget::strcut(QString *str_target, QString str_goal)
{
    QString str_result;
    int index = str_target->indexOf(str_goal);
    int len = str_target->length();
    int chop_len = len - index;
    str_target->chop(chop_len);
    return 0;
}

int SubWidget::getProgress()
{
    return progress;
}

QString SubWidget::gettxtHex()
{
    return (txtHex_All.toPlainText());
}
