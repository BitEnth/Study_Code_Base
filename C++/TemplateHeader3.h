#include <iostream>
using namespace std;

template <class T>
class A
{
public:
	A(){
		cout << "model A's construction" << endl;
	}
	~A(){
		cout << "model A's destruction" << endl;
	}
	void funca(T a){
		cout << "model A's function, parameter is " << a << endl;
	}
};

template <class T1, class T2>
class B:public A<T1>
{
public:
	B(){
		cout << "derived B's construction" << endl;
	}
	~B(){
		cout << "derived B's destruction" << endl;
	}
	void funcb(T1 t1, T2 t2){
		cout << "derived B's function, parameter is " << t1 << t2 << endl;
	}
};
