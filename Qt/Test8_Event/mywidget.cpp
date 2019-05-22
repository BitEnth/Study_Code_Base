#include "mywidget.h"
#include "ui_mywidget.h"
#include <QDebug>
#include <QMessageBox>

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

void MyWidget::keyPressEvent(QKeyEvent *e)
{
    qDebug() << e->key();
}

void MyWidget::timerEvent(QTimerEvent *e)
{
    static int sec = 100;
    sec--;
    ui->lcdNum->display(sec);
    //if(sec == 0){
        //killTimer(e->timerId());
    //}
}

void MyWidget::on_startBtn_clicked()
{
    TimerID = startTimer(1000);
}



void MyWidget::on_endBtn_clicked()
{
    if(TimerID){
        killTimer(TimerID);
        TimerID = 0;
    }
    else{
        QMessageBox::warning(this, "Warning", "Timer doesn't start!");
    }
}
