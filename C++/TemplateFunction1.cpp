#include <iostream>
#include <stdio.h>
using namespace std;

template <class T>
void Exchange(T *t1, T *t2){
	T temp;
	temp = *t1;
	*t1 = *t2;
	*t2 = temp;
}

int main(void)
{
	int num1, num2;
	cout << "Please input two integers" << endl;
	cin >> num1 >> num2;
	cout << "before exchange: ";
	cout << "num1 = " << num1 << ", num2 = " << num2 << endl;
	Exchange(&num1, &num2);
	cout << "after exchange: ";
	cout << "num1 = " << num1 << ", num2 = " << num2 << endl;
	
	char ch1, ch2;
	cout << "Please input two characters" << endl;
	cin >> ch1 >> ch2;
	cout << "before exchange: ";
	cout << "ch1 = " << ch1 << ", ch2 = " << ch2 << endl;
	Exchange(&ch1, &ch2);
	cout << "after exchange: ";
	cout << "ch1 = " << ch1 << ", ch2 = " << ch2 << endl;
	return 0; 
}
