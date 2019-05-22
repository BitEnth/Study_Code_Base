#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    this->setStyleSheet("QLabel{background-color:yellow; color: red}");
    ui->label1->setStyleSheet("QLabel{border-image:url(://ss1.jpeg); color: brown}");
    ui->pushButton->setStyleSheet("QPushButton{border-image:url(://ss2.jpeg);"
                                  "}QPushButton:hover{border-image:url(://ss3.jpg)}");
}

MainWindow::~MainWindow()
{
    delete ui;
}
