#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <string>
#include <stdio.h>
#include <stdlib.h>
#include "subwidget.h"
using namespace std;

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = nullptr);
    ~MainWindow();
    int char2int(char *c, int *i_arr, int len);
    QString int2qstr(int *i_arr, int len);
    int qstr2char(char *c, QString qstr, int len);
    int qhex2char(QString qstr);
    int qstrhexswitch(QString qstr);
    int openFilepath();
    int getFilesize();
    int getCharLen(char *c);

private slots:
    void on_openBtn1_clicked();

    void on_btnSave_clicked();

private:
    Ui::MainWindow *ui;
    SubWidget sw;
    qint64 f_size;
    QString f_path;
};

#endif // MAINWINDOW_H
