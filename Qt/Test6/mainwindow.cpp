#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QDebug>
#include <QCompleter>
#include <QStringList>
#include <QMovie>

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    QString txt1 = ui->lineEdit->text();
    qDebug() << txt1;
    ui->lineEdit->setTextMargins(15, 0, 0, 0);
    //ui->lineEdit->setEchoMode(QLineEdit::Password);
    QStringList strlist1;
    strlist1 << "Hello" << "What the hell?" << "What's the fucking wrong?";
    QCompleter *qcom = new QCompleter(strlist1, this);
    qcom->setCaseSensitivity(Qt::CaseInsensitive);
    ui->lineEdit->setCompleter(qcom);
    ui->label_image->setPixmap(QPixmap("://img1.jpeg"));
    ui->label_image->setScaledContents(true);
    QMovie *myMovie = new QMovie("://20190318100207.gif");
    ui->label_gif->setMovie(myMovie);
    myMovie->start();
    ui->label_gif->setScaledContents(true);
    ui->label_url->setText("<h4><a href='Baidu.html'>Baidu</a></h4>");
    ui->label_url->setOpenExternalLinks(true);
    ui->lcdNumber->display("18:35");
    ui->progressBar->setRange(0, 100);
    ui->progressBar->setValue(78);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_ChangePage_clicked()
{
    static int i;
    ui->stackedWidget->setCurrentIndex(i % 4);
    i++;
}
