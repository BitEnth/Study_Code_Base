#include "mywidget.h"
#include "ui_mywidget.h"
#include <QFile>
#include <QFileDialog>
#include <QFileInfo>
#include <QDebug>
#include <QDateTime>

MyWidget::MyWidget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::MyWidget)
{
    ui->setupUi(this);
}

MyWidget::~MyWidget()
{
    delete ui;
}

void MyWidget::on_btnRead_clicked()
{
    QString path_read;
    path_read = QFileDialog::getOpenFileName(this, "Open File", "../", "All(*.*);;Txt(*.txt);;HTML(*.htm *.html);;C Source(*.h *.cpp)");
    if(path_read.isEmpty() == false){
        QFile file_read(path_read);
        bool isOpen = file_read.open(QFile::ReadOnly);  //QIODevice::ReadOnly
        if(isOpen == true){
            QByteArray array;
            //array = file_read.readAll();
            while (file_read.atEnd() == false) {
                array += file_read.readLine();
            }
            ui->textEdit->setText(QString(array));
        }
        file_read.close();
        QFileInfo file_info(path_read);
        qDebug() << "file route: " << file_info.path();
        qDebug() << "file type: " << file_info.suffix();
        qDebug() << "file size: " << file_info.size();
        qDebug() << "file created time: " << file_info.metadataChangeTime().toString("yyyy MM dd hh:mm:ss"); //created()

    }
}

void MyWidget::on_btnWrite_clicked()
{
    QString path_write;
    path_write = QFileDialog::getSaveFileName(this, "Save File", "../", "All(*.*);;Txt(*.txt)");
    if(path_write.isEmpty() == false){
        QFile file_write;
        file_write.setFileName(path_write);
        bool isWrite = file_write.open(QIODevice::WriteOnly);
        if(isWrite == true){
            QString str_write = ui->textEdit->toPlainText();
            /*
             * QString -> QByteArray: toUtf8() toLocal8bit()
             * QByteArray -> char *: data()
             * QString -> C++ standard string: toStdString()
             * QString -> char *: toStdString().data()
             * char * -> QString: QString(const char*)
            */
            file_write.write(str_write.toStdString().data());
        }
        file_write.close();
    }
}
