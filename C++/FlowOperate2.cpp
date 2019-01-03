#include <iostream>
using namespace std;
#define SIZE 15

int main(void)
{
	int n, p;
	int num = 12;
	float fnum = 12.345;
	cout << "use width() and precision() function." << endl;
	cout << "fnum = " << fnum << endl;
	n = cout.width();
	p = cout.precision();
	cout << "present setting filed is: " << n << endl;
	cout << "present setting significant figure is: " << p << endl;
	cout << num << endl;
	cout.width(6);
	cout << num << endl;
	cout << "use fill() function" << endl;
	cout.fill('#');
	cout.width(10);
	cout << 123456 << endl;
	cout.fill('\0');
	cout << 123456789 << endl;
	return 0;
}
