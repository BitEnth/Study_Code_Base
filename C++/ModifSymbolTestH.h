#include <iostream>
using namespace std;

int num;
int extern_num;

void ShowAddreess()
{
	int tnum;
	cout << "The address of extern_num in header: " << &extern_num << endl;
	cout << "The address of num in header: " << &num << endl;
	cout << "The address of tnum in header function: " << &tnum << endl;
}
