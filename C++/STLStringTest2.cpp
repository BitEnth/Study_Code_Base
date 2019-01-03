#include <iostream>
#include <string>
#include <stdlib.h>
using namespace std;

int main(void)
{
	string str1;
	string str2("hello");
	string str3(3, 'a');
	string str4("\0qwerty");
	int position;
	
	cout << "the length of str3: " << str3.length() << endl;
	cout << "the occupying bytes of str1 are " << str1.size() << endl;
	cout << "the length of str4: " << str4.length() << endl;
	cout << "the occupying size of str4 is " << str4.size() << endl;
	position = str2.find("ll");
	cout << " 'll' in str2 is " << position << endl;
	
	if (str2.empty()){
		cout << "str2 is empty" << endl;
	}
	else{
		cout << "str2 is not empty" << endl;
	}
	system("exit");
	return 0;
}
