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
    void paintEvent(QPaintEvent *e);

private slots:
    void on_MoveBtn_clicked();

private:
    Ui::MyWidget *ui;
    int cloud_x;
    int cloud_y;
};

#endif // MYWIDGET_H
