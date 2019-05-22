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
    void WriteData();
    void ReadData();

private slots:
    void on_btnWrite_clicked();

    void on_btnRead_clicked();

private:
    Ui::MyWidget *ui;
};

#endif // MYWIDGET_H
