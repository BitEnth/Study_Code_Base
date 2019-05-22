#ifndef MYWIDGET_H
#define MYWIDGET_H

#include <QWidget>

namespace Ui {
class MyWidget;
}

class MyWidget : public QWidget
{
    Q_OBJECT

public:
    explicit MyWidget(QWidget *parent = nullptr);
    ~MyWidget();

protected:
    void keyPressEvent(QKeyEvent *e);
    void timerEvent(QTimerEvent *e);

private slots:
    void on_startBtn_clicked();

    void on_endBtn_clicked();

private:
    Ui::MyWidget *ui;
    int TimerID;
};

#endif // MYWIDGET_H
