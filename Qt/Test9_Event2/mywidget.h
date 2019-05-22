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
    void mousePressEvent(QMouseEvent *e);
    void closeEvent(QCloseEvent *e);
    bool event(QEvent *e);

private slots:

    void on_pushButton_pressed();

private:
    Ui::MyWidget *ui;
};

#endif // MYWIDGET_H
