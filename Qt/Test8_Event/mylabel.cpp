#include "mylabel.h"


MyLabel::MyLabel(QWidget *parent) : QLabel (parent)
{
    this->setMouseTracking(true);
}

void MyLabel::mousePressEvent(QMouseEvent *e)
{
    int i = e->x();
    int j = e->y();
    if(e->button() == Qt::LeftButton){
        QString txt = QString("<center><h3>Mouse Pressed: %1, %2</h3></center>").arg(i).arg(j);
        this->setText(txt);
    }
}

void MyLabel::mouseMoveEvent(QMouseEvent *e)
{
    QString txt = QString("<center><h3>Mouse Move: %1, %2</h3></center>").arg(e->x()).arg(e->y());
    this->setText(txt);
}

void MyLabel::mouseReleaseEvent(QMouseEvent *e)
{
    QString txt = QString("Mouse Release: %1, %2").arg(e->x()).arg(e->y());
    this->setText(txt);
}

void MyLabel::enterEvent(QEvent *e)
{

}
void MyLabel::leaveEvent(QEvent *e)
{

}
