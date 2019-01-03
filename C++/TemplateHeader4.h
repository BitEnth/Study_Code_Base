#include <iostream>
using namespace std;

class A
{
private:
	int x, y;
public:
	A(int a, int b){
		cout << "ordinary class's construction with two parameters" << endl;
		x = a;
		y = b;
	}
	~A(){
		cout << "ordinary class's destruction" << endl;
	}
	void displaya(){
		cout << "ordinary class outputs variale" << endl;
		cout << "x = " << x << ", y = " << y << endl;
	}
};

template <class T>
class B:public A
{
	T x2, y2;
public:
	//firstly, initial class A, then initial class B
	B(int a, int b, T c, T d):A(a, b){
		cout << "model class's construction with two parameters" << endl;
		x2 = c;
		y2 = d;
	}
	~B(){
		cout << "model class's destruction" << endl;
	}
	void displayb(){
		cout << "reload the output function of ordinary class" << endl;
		cout << "x2 = " << x2 << ", y2 = " << y2 << endl;
	}
	void show(){
		cout << "output function of model class" << endl;
		cout << "x2 = " << x2 << ", y2 = " << y2 << endl;
	}
};
