#include "mywidget.h"
#include "ui_mywidget.h"
#include <QEvent>
#include <QMouseEvent>

MyWidget::MyWidget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::MyWidget)
{
    ui->setupUi(this);
    setMouseTracking(true);
    //ui->lcdx->installEventFilter(this);
    //ui->lcdy->installEventFilter(this);
}

MyWidget::~MyWidget()
{
    delete ui;
}

void MyWidget::mouseMoveEvent(QMouseEvent *e)
{
    ui->lcdx->display(e->x());
    ui->lcdy->display(e->y());
}

bool MyWidget::eventFilter(QObject *obj, QEvent *e)
{
    QMouseEvent *ev = dynamic_cast<QMouseEvent *>(e);
    //QObject *ow = dynamic_cast<QObject *>(this->MyWidget);
    if(obj == this){
        //if(e->type() == QEvent::MouseMove){
            //ui->lcdx->display(ev->x());
            //ui->lcdy->display(ev->y());
        //}
        return QWidget::eventFilter(obj, e);
    }
    else{
        return QWidget::eventFilter(obj, e);
    }
}
