#include <strstream>
#include <iostream>
using namespace std;

int main(void)
{
	double a;
	char dNum[10] = "12.345";
	istrstream stri1(dNum, 10);
	stri1 >> a;
	cout << "using istrstream to convert : " << a << endl;
	
	char iNum[10] = "12f45";
	istrstream stri2(iNum, 10);
	stri2 >> a;
	cout << "using istrstream to convert string to int :" << a << endl;
	return 0;
}
