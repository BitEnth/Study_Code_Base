#include "dialog.h"
#include <QGridLayout>

Dialog::Dialog(QWidget *parent) :
    QDialog(parent)
{
    label1 = new QLabel(this);
    label1->setText(tr("Input the radius:"));
    lineEdit = new QLineEdit(this);
    label2 = new QLabel(this);
    button = new QPushButton(this);
    button->setText(tr("Show the area of cycle"));
    QGridLayout *mainLayout = new QGridLayout(this);
    mainLayout->addWidget(label1,0,0);
    mainLayout->addWidget(lineEdit,0,1);
    mainLayout->addWidget(label2,1,0);
    mainLayout->addWidget(button,1,1);
}
