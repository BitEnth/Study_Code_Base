#include "mybutton.h"
#include <QMouseEvent>
#include <QDebug>

MyButton::MyButton(QWidget *parent):QPushButton (parent)
{

}

void MyButton::mousePressEvent(QMouseEvent *E)
{
    if(E->button() == Qt::LeftButton){
        qDebug() << "Left &_*||";
        //E->ignore();
    }
    else{
        QPushButton::mousePressEvent(E);
    }
}
