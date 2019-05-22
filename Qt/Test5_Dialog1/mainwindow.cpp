#include "mainwindow.h"
#include <QMenu>
#include <QMenuBar>
#include <QAction>
#include <QDialog>
#include <QDebug>
#include <QMessageBox>
#include <QFileDialog>

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
{
    QMenuBar *mBar = menuBar();
    setMenuBar(mBar);
    QMenu *menu = mBar->addMenu("Dialog");
    QAction *pmenu1 = menu->addAction("Locked Dialog");
    connect(pmenu1, &QAction::triggered,
            [](){
                QDialog dlg1;
                dlg1.exec();
                qDebug() << "#(_^";
            }
            );
    QAction *pmenu2 = menu->addAction("Unlocked Dialog");
    connect(pmenu2, &QAction::triggered,
            [=](){
                QDialog *dlg2 = new QDialog(this);
                dlg2->setAttribute(Qt::WA_DeleteOnClose);
                dlg2->show();
                qDebug() << "!+_=";
            }
            );
    QAction *pmenu3 = menu->addAction("About");
    connect(pmenu3, &QAction::triggered,
            [=](){
                QMessageBox::about(this, "About", "About Qt");
            }
            );
    QAction *pmenu4 = menu->addAction("Question");
    connect(pmenu4, &QAction::triggered,
            [=](){
               int result = QMessageBox::question(this, "Question", "Are you sure?", QMessageBox::Ok, QMessageBox::No, QMessageBox::Cancel);
               switch (result) {
               case QMessageBox::Ok :
                   qDebug() << "Sure";
                   break;
               case QMessageBox::No :
                   qDebug() << "Not sure";
                   break;
               default:
                   break;
               }
            }
            );
    QAction *pmenu5 = menu->addAction("Open File");
    connect(pmenu5, &QAction::triggered,
            [=](){
                QString path = QFileDialog::getOpenFileName(this, "Open File", "/home", "C source(*.cpp *.h);;Text(*.txt);;all(*.*)");
                qDebug() << path;
            }
            );
}

MainWindow::~MainWindow()
{

}
