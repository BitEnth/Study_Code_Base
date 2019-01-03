#include <stdio.h>
#include <iostream>
using namespace std;

int main(void)
{
	int num;
	float f;
	char ch;
	char str[16];
	cout << "convert flow operation." << endl;
	printf("Input the integer, float, character, string:\n");
	cin >> num >> f >> ch >> str;
	cout << "num = " << num << ", f = " << f << ", ch = " << ch << ", str = "
		<< str;
	return 0;
}
