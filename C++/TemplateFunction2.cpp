#include <iostream>
using namespace std;

template <class T>
void func(T a){
	cout << "model function with one parameter" << endl;
}

template <class T1, class T2>
void func(T1 t1, T2 t2){
	cout << "model function with two parameters" << endl;
	cout << "t1 = " << t1 << ", t2 = " << t2 << endl;
}

void func(int num){
	cout << "ordinary function with one integer parameter" << endl;
}

void func(int t1, int t2){
	cout << "ordinary function with two integer parameters" << endl;
}

int main(void)
{
	cout << "use a parameter" << endl;
	func(3);
	func(1.2);
	cout << "use two parameters" << endl;
	func(1, 2);
	func(1.2, 1.3);
	func(1, 'a');
	return 0;
}
