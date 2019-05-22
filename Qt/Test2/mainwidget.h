#ifndef MAINWIDGET_H
#define MAINWIDGET_H

#include <QWidget>
#include <QPushButton>
#include "subwidget.h"

class MainWidget : public QWidget
{
    Q_OBJECT

public:
    MainWidget(QWidget *parent = 0);
    ~MainWidget();

    void Myslot();
    void ChangetoSub();
    void ChangetoMain();
    void PrintSub(int, QString);

private:
    QPushButton b1;
    QPushButton *b2;
    QPushButton b3;
    QPushButton b5;
    subwidget sw;
};

#endif // MAINWIDGET_H
