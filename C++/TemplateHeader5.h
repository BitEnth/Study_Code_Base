#include <iostream>
using namespace std;

template <class T>
class BaseA
{
public:
	int a;
	BaseA(T num){
		cout << "Base A's construction" << endl;
		a = num;
	}
	void showa(){
		cout << "In base A" << endl;
		cout << "a = " << a << endl;
	}
};

template <class T>
class BaseB
{
public:
	int b;
	BaseB(T num){
		cout << "Base B's construction" << endl;
		b = num;
	}
	void showb(){
		cout << "In base b" << endl;
		cout << "b = " << b << endl;
	}
};

class C:public BaseA<int>, public BaseB<int>
{
private:
	int d;
public:
	C(int x, int y, int z):BaseA<int>(x), BaseB<int>(y){
		cout << "Derived class C's construction" << endl;
		d = z;
	}
	void showc(){
		cout << "In class C" << endl;
		cout << "a = " << a << ", b = " << b << ", d = " << d << endl;
	}
};
