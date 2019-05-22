#include <QApplication>
#include <QWidget>
#include <QPushButton>

int main(int argc, char **argv)
{
    QApplication app(argc, argv);
    QWidget w;
    w.setWindowTitle("Fuck...");
    QPushButton b;
    b.setText("Button");
    b.setParent(&w);
    b.move(100, 100);
    QPushButton b1(&w);
    b1.setText("Button2");
    w.show();
    app.exec();
    return 0;
}
