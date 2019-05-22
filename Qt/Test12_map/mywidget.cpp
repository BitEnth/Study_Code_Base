#include "mywidget.h"
#include "ui_mywidget.h"
#include <QPainter>
#include <QBitmap>

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

void MyWidget::paintEvent(QPaintEvent *)
{
    QPainter p(this);
    p.drawPixmap(0, 0, 200, 100, QPixmap("../flower.bmp"));
    QBitmap pbmp;
    pbmp.load("../flower.bmp");
    p.drawPixmap(200, 0, 200, 100, pbmp);
}
