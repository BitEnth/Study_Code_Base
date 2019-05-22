#include "mywidget.h"
#include <QPainter>

MyWidget::MyWidget(QWidget *parent)
    : QWidget(parent)
{

}

MyWidget::~MyWidget()
{

}

void MyWidget::paintEvent(QPaintEvent *)
{
    QImage pimg;
    QPixmap ppix;
    QPainter p(this);
    pimg.load("../flower.bmp");
    ppix = QPixmap::fromImage(pimg);
    p.drawPixmap(0, 0, 200, 100, ppix);
    ppix.load("../flower9.jpeg");
    pimg = ppix.toImage();
    p.drawImage(200, 100, pimg);
}
