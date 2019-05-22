#include "mainwidget.h"

MainWidget::MainWidget(QWidget *parent)
    : QWidget(parent)
{
    this->setWindowTitle("Main window");
    resize(400, 400);
    b1.setParent(this);
    b1.setText("Close");
    b1.move(100,100);
    b2 = new QPushButton(this);
    b2->setText("Btn2");
    b3.setParent(this);
    b3.setText("Change to Sub Window");
    b3.move(200, 200);
    b5.setParent(this);
    b5.setText("Lamda");
    b5.move(150,160);
    int a = 10, b = 4;
    //sw.show();
    connect(&b1, &QPushButton::pressed, this, &MainWidget::close);
    connect(b2, &QPushButton::released, this, &MainWidget::Myslot);
    connect(b2, &QPushButton::released, &b1, &QPushButton::hide);
    connect(&b3, &QPushButton::released, this, &MainWidget::ChangetoSub);
    void (subwidget::*func1)()= &subwidget::SubSignal;
    void (subwidget::*func2)(int, QString) = &subwidget::SubSignal;
    connect(&sw, func1, this, &MainWidget::ChangetoMain);
    connect(&sw, func2, this, &MainWidget::PrintSub);
    /*Anonymous function, Lamda expression
    *[=]: external all variables with addresses
    *[this]: all available members in class
    *[&]: external all variables with values, careful to use.
    */
    connect(&b5, &QPushButton::clicked,
            [=](bool isChecked) mutable{
                qDebug() << "11ksokd";
                qDebug() << isChecked;
                a = 12;
                qDebug() << a << b;
            }
            );

}

void MainWidget::Myslot()
{
    b2->setText("Change");
}

void MainWidget::ChangetoSub()
{
    sw.show();
    this->hide();
}

void MainWidget::ChangetoMain()
{
    sw.hide();
    this->show();
}

void MainWidget::PrintSub(int a, QString s)
{
    qDebug() << a << s;
}
MainWidget::~MainWidget()
{

}
