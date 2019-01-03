#include <fstream>
#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	ofstream file1;
	string str = "File flow operation\n";
	file1.open("test1");
	file1 << "Example words" << endl;
	file1 << str;
	file1.close();
	ifstream file2;
	char ch[64];
	file2.open("test1");
	while(file2 >> ch){
		cout << ch << endl;
	}
	return 0;
}
