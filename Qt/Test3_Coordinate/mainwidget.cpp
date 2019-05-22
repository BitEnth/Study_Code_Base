#include "mainwidget.h"
#include <QPushButton>
#include "mybutton.h"

MainWidget::MainWidget(QWidget *parent)
    : QWidget(parent)
{
    move(400, 100);
    QPushButton *B1 = new QPushButton(this);
    B1->setText("Q_O#");
    B1->move(100, 100);

    MyButton *B2 = new MyButton(this);
    B2->setText("@_-|||");
}

MainWidget::~MainWidget()
{

}
