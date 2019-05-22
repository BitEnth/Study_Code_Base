#ifndef SUBWIDGET_H
#define SUBWIDGET_H

#include <QWidget>
#include <QPushButton>
#include <QDebug>

class subwidget : public QWidget
{
    Q_OBJECT
public:
    explicit subwidget(QWidget *parent = nullptr);
    void SendSignals();

signals:
    void SubSignal();
    void SubSignal(int, QString);

public slots:

private:
    QPushButton b4;
};

#endif // SUBWIDGET_H
