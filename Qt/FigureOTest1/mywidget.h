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
    int qstr2char(char *c, QString qstr, int len_c);
    int qhex2char(QString qstr);
    int qstrhexswitch(QString qstr);

private slots:
    void on_btnTransfer_clicked();

private:
    Ui::MyWidget *ui;
};

#endif // MYWIDGET_H
