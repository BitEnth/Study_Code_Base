#include "mywidget.h"
#include "ui_mywidget.h"

MyWidget::MyWidget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::MyWidget)
{
    ui->setupUi(this);
    int i_arr[10];
    QString i_str;
    for (int i = 0, j = -3;i < 10;i++, j--) {
        i_arr[i] = i*j-7;
        i_str += QString::number(i_arr[i]);
    }
    ui->textBrowser->setText(i_str);
}

MyWidget::~MyWidget()
{
    delete ui;
}
