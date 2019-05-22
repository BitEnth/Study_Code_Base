#include "mywidget.h"
#include <QPainter>
#include <QPicture>

MyWidget::MyWidget(QWidget *parent)
    : QWidget(parent)
{
    QPicture ppic;
    QPainter p;
    p.begin(&ppic);
    p.drawPixmap(0, 0, 200, 100, QPixmap("../flower.bmp"));
    p.end();
    ppic.save("../flower.bin");

}

MyWidget::~MyWidget()
{

}

void MyWidget::paintEvent(QPaintEvent *)
{
    QPicture pic;
    QPainter p;
    p.begin(this);
    pic.load("../flower.bin");
    p.drawPicture(0, 0, pic);
    p.end();
}
