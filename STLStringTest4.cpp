#include <iostream>
#include <string>
#include <stdlib.h>
using namespace std;

int main(void)
{
	string str("Hello Ketty");
	cout << "insert '123' at beginning" << endl;
	str.insert(0, "123");
	cout << str << endl;
	cout << "insert 4 chars of '123456' at No.5 of str" << endl;
	str.insert(5, "123456", 4);
	cout << str << endl;
	cout << "delete No.13 and after that of str" << endl;
	str.erase(13);
	cout << str << endl;
	cout << "delete No.2 to No.6 of str" << endl;
	str.erase(2, 5);
	cout << str << endl;
	return 0;
}
