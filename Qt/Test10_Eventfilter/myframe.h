#ifndef MYFRAME_H
#define MYFRAME_H

#include <QFrame>

class MyFrame : public QFrame
{
    Q_OBJECT
public:
    explicit MyFrame(QWidget *parent = nullptr);

protected:
    void mouseMoveEvent(QMouseEvent *e);

signals:

public slots:
};

#endif // MYFRAME_H
