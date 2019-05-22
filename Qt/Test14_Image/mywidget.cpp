#include "mywidget.h"
#include <QPainter>

MyWidget::MyWidget(QWidget *parent)
    : QWidget(parent)
{
    QImage pimg(300, 150, QImage::Format_ARGB32);
    QPainter p;
    p.begin(&pimg);
    p.drawImage(0, 0, QImage("../flower.bmp"));
    for (int i = 0; i < 50; ++i) {
        for (int j = 0; j < 50; ++j) {
            pimg.setPixelColor(i*2, j*3, qRgb(0, 255, 80));
            pimg.setPixel(i*3, j*2, qRgb(0, 80, 255));
            //pimg.pixel(i,j);
        }
    }
    p.end();
    pimg.save("../flower9.jpeg");
}

MyWidget::~MyWidget()
{

}
