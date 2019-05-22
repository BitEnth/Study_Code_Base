#include "mywidget.h"
#include "ui_mywidget.h"
#include <QPainter>

MyWidget::MyWidget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::MyWidget)
{
    ui->setupUi(this);
    cloud_x = 0;
    cloud_y = 200;
}

MyWidget::~MyWidget()
{
    delete ui;
}

void MyWidget::paintEvent(QPaintEvent *e)
{
    //QPainter p(this);
    QPainter p;
    p.begin(this);
    //p.drawPixmap(0,0,width(), height(), QPixmap("JS4.jpeg"));
    //p.drawPixmap(rect(), QPixmap("JS4.jpeg"));
    QPen pen;
    QBrush brush;
    pen.setColor(Qt::red);
    pen.setWidth(3);
    pen.setStyle(Qt::DotLine);
    brush.setColor(QColor(66, 166, 166));
    brush.setStyle(Qt::Dense1Pattern);
    p.setPen(pen);
    p.setBrush(brush);
    //p.setPen(Qt::DotLine);
    p.drawLine(50, 50, 50, 200);
    p.drawArc(0, 150, 100, 100, 0, 1800);
    p.drawRect(100, 100, 100, 50);
    p.drawEllipse(200, 100, 100, 50);
    p.drawPie(150, 150, 100, 100, 0, 600);
    p.drawPixmap(cloud_x, cloud_y, 50, 100, QPixmap("cloud.png"));
    p.end();
}

void MyWidget::on_MoveBtn_clicked()
{
    cloud_x += 10;
    cloud_y = 200 - (cloud_x)*2;
    if(cloud_y < 0){
        cloud_x = 0;
        cloud_y = 300;
    }
    update();
}
