#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	float num1, num2;
	float div;
	//cout << "input two numbers" << endl;
	//cin >> num1 >> num2;
	num1 = 0.9;
	num2 = 0;
	try{
		cout << "divide zero when calculating" << endl;
		div = num1 / num2;
		cout << div << endl;
		exception e;
		throw e;
	}
	catch(exception &error){
		cerr << "Exception: " << error.what() << endl;
	}
	catch(...){
		cout << "catch the undefined error" << endl;
	}
	return 0;
}
