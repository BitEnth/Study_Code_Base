#include <iostream>
#include <string>
#include <stdlib.h>
using namespace std;

int main(void)
{
	string str("hello world");
	int i;
	
	cout << "str = " << str << endl;
	cout << "input character" << endl;
	for(i = 0;i < 5;i++){
		cin >> &str[i];
	}
	for(i = 0;i < 11;i++){
		cout << str.at(i) << endl;
	}
	cout << str << endl;
	return 0;
}
