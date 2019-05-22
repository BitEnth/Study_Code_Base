#include "mywidget.h"
#include <QPainter>
#include <QMouseEvent>

MyWidget::MyWidget(QWidget *parent)
    : QWidget(parent)
{
    setWindowFlag(Qt::FramelessWindowHint);
    setAttribute(Qt::WA_TranslucentBackground);
}

MyWidget::~MyWidget()
{

}

void MyWidget::paintEvent(QPaintEvent *)
{
    QPainter p(this);
    p.drawPixmap(0, 0, QPixmap("../JS1.jpeg"));
}

void MyWidget::mousePressEvent(QMouseEvent *e)
{
    if(e->button() == Qt::RightButton){
        close();
    }
    else if(e->button() == Qt::LeftButton){
        p = e->globalPos() - this->frameGeometry().topLeft();
    }
}

void MyWidget::mouseMoveEvent(QMouseEvent *e)
{
    if(e->buttons() & Qt::LeftButton){
        move(e->globalPos() - p);
    }
}
