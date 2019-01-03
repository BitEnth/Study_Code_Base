#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	string str1;
	string str2("Hello");
	string str3(10, 'a');
	
	cout << "Input a piece of string" << endl;
	cin >> str1;
	cout << "what you input: " << str1 << endl;
	cout << "str2 = " << str2 << endl;
	cout << "Input something" << endl;
	cin >> str2;
	cout << "now str2 is " << str2 << endl;
	cout << "str3 = " << str3 << endl;
	return 0;
}
