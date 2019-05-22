#include "mywidget.h"
#include "ui_mywidget.h"
#include <QDebug>
#include <QMessageBox>
#include <QCloseEvent>

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

void MyWidget::on_pushButton_pressed()
{
    qDebug() << "Right %_@";
}

void MyWidget::mousePressEvent(QMouseEvent *e)
{
    qDebug() << "\\ @_@# /";
}

void MyWidget::closeEvent(QCloseEvent *e)
{
    int result = QMessageBox::question(this, "Question", "Close this window?");
    if(result == QMessageBox::Yes){
        e->accept();
    }
    else{
        e->ignore();
    }
}

bool MyWidget::event(QEvent *e)
{
    if(e->type() == QEvent::MouseButtonPress){
        e->accept();
        QMouseEvent *en = dynamic_cast<QMouseEvent *>(e);
        if(en->button() == Qt::MidButton){
           qDebug() << "(*(*)()";
        }
        return false;
    }
    else{
        QWidget::event(e);
        return false;
    }
}
