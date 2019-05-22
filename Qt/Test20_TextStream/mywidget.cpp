#include "mywidget.h"
#include "ui_mywidget.h"
#include <QFile>
#include <QTextStream>
#include <QFileDialog>

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
    ReadText();
}

void MyWidget::on_btnWrite_clicked()
{
    WriteText();
}

void MyWidget::ReadText()
{
    QString path = QFileDialog::getOpenFileName(this, "Open File", "../");
    if(path.isEmpty() == false){
        QFile file_read(path);
        bool isOpen = file_read.open(QIODevice::ReadOnly);
        if(isOpen){
            QTextStream sread(&file_read);
            QString str = sread.readAll();
            ui->textEdit->setText(str);
        }
        file_read.close();
    }
}

void MyWidget::WriteText()
{
    QString path = QFileDialog::getSaveFileName(this, "Save files", "../");
    if(path.isEmpty() == false){
        QFile file_write(path);
        bool isOpen = file_write.open(QIODevice::WriteOnly);
        if(isOpen){
            QTextStream swrite(&file_write);
            swrite.setCodec("UTF-8");
            QString str = ui->textEdit->toPlainText();
            swrite << str;
        }
        file_write.close();
    }
}
