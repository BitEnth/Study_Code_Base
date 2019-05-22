#include "subwidget.h"

subwidget::subwidget(QWidget *parent) : QWidget(parent)
{
    setWindowTitle("Sub Window");
    this->resize(150, 150);
    b4.setParent(this);
    b4.setText("Change to Main Window");
    connect(&b4, &QPushButton::clicked, this, &subwidget::SendSignals);
}

void subwidget::SendSignals()
{
    emit SubSignal();
    emit SubSignal(1829, "JackSparrow");
}
