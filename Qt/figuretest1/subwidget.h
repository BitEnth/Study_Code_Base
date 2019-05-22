#ifndef SUBWIDGET_H
#define SUBWIDGET_H

#include <QWidget>
#include <QTextEdit>
#include <QHBoxLayout>
#include <iostream>
#include <fstream>
using namespace std;

class SubWidget : public QWidget
{
    Q_OBJECT
public:
    explicit SubWidget(QWidget *parent = nullptr);
    int copypath(QString path_target);
    int readFile();
    int getProgress();
    int strcut(QString *str_target, QString str_goal);
    QString gettxtHex();

signals:

public slots:


private:
    int progress;
    QString path_sub;
    QTextEdit txtHex_All;
    QTextEdit txtHex_Info;
    QHBoxLayout *hlayout;

};

#endif // SUBWIDGET_H
