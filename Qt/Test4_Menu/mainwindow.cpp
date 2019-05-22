#include "mainwindow.h"
#include <QMenuBar>
#include <QMenu>
#include <QAction>
#include <QtDebug>
#include <QToolBar>
#include <QPushButton>
#include <QStatusBar>
#include <QLabel>
#include <QTextEdit>
#include <QDockWidget>

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
{
    QMenuBar *mBar = menuBar();
    QMenu *pFile = mBar->addMenu("File");
    QAction *pNew = pFile->addAction("New File");
    connect(pNew, &QAction::triggered,
            [](){
                qDebug() << "New File";
            }
            );
    pFile->addSeparator();
    QAction *pOpen = pFile->addAction("Open File");
    QToolBar *toolbar = addToolBar("ToolBar");
    toolbar->addAction(pNew);
    toolbar->addAction(pOpen);
    QPushButton *B1 = new QPushButton(this);
    B1->setText("++");
    toolbar->addWidget(B1);
    connect(B1, &QPushButton::clicked,
            [=](){
                B1->setText("+_=");
            }
            );
    QStatusBar *sBar = statusBar();
    QLabel *label1 = new QLabel(this);
    label1->setText("Normal text file");
    sBar->addWidget(label1);
    sBar->addWidget(new QLabel("$_*", this));
    sBar->addPermanentWidget(new QLabel("%_@", this));
    QTextEdit *txt = new QTextEdit(this);
    setCentralWidget(txt);
    QDockWidget *dock = new QDockWidget(this);
    addDockWidget(Qt::RightDockWidgetArea, dock);
    QTextEdit *txt1 = new QTextEdit(this);
    dock->setWidget(txt1);
}

MainWindow::~MainWindow()
{

}
