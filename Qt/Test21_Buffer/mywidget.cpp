#include "mywidget.h"
#include "ui_mywidget.h"
#include <QBuffer>
#include <QDataStream>

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
    QBuffer memFile(this);
    memFile.open(QIODevice::ReadWrite);
    QDataStream qds(&memFile);
    qds << memFile.buffer();
    memFile.close();
    QString str;
    //str = QString(memFile.buffer());
    qds >> str;
    ui->textEdit->setText(str);
}

void MyWidget::on_btnWrite_clicked()
{
    QBuffer memFile(this);
    memFile.open(QIODevice::WriteOnly);
    QString str = ui->textEdit->toPlainText();
    char * str_c = str.toUtf8().data();
    memFile.write(str_c);
    ui->textBrowser->setText(memFile.buffer());
    memFile.close();
}
