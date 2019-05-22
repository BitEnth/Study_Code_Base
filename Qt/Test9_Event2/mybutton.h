#ifndef MYBUTTON_H
#define MYBUTTON_H

#include <QPushButton>

class MyButton : public QPushButton
{
public:
    MyButton(QWidget *parent = nullptr);

protected:
    void mousePressEvent(QMouseEvent *E);
};

#endif // MYBUTTON_H
