#include "mywidget.h"
#include "ui_mywidget.h"
#include <QDebug>
#include <QFile>
#include <QDataStream>

#define cout qDebug() << "[" << __FILE__ << __LINE__ << "]"

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

void MyWidget::WriteData()
{
    QFile file_write("../Test2.txt");
    bool isOpen = file_write.open(QIODevice::WriteOnly);
    if(isOpen == true){
        QDataStream qds(&file_write);
        QString str = "What the fu*k!!!";
        qds << str << 1728;
    }
    file_write.close();
}

void MyWidget::ReadData()
{
    QFile file_read("../Test2.txt");
    bool isOpen = file_read.open(QIODevice::ReadOnly);
    if(isOpen){
        QDataStream qds(&file_read);
        QString str;
        int i;
        qds >> str >> i;
        cout << str << i;
    }
    file_read.close();
}

void MyWidget::on_btnWrite_clicked()
{
    WriteData();
}

void MyWidget::on_btnRead_clicked()
{
    ReadData();
}
