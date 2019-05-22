#include "widget.h"
#include "ui_widget.h"
#include <QPainter>
#include <QPixmap>

Widget::Widget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Widget)
{
    ui->setupUi(this);
    QPixmap pixmap(300, 150);
    QPainter p(&pixmap);
    //pixmap.fill(Qt::white);
    p.fillRect(0, 0, 300, 130, QBrush(Qt::white));
    p.drawPixmap(0, 0, 200, 100, QPixmap("../flower.bmp"));
    pixmap.save("../flower4.jpeg");

}

Widget::~Widget()
{
    delete ui;
}
