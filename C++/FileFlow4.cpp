#include <iostream>
#include <fstream>
#include <cstring>
using namespace std;

int main(void)
{
	ofstream file1;
	char str1[23] = "C++ stream test write\n";
	file1.open("test1");
	file1.write(str1, 22); // 23 to the binary file
	file1.close();
	
	ifstream file2;
	char str2[32];
	memset(str2, 0, sizeof(str2)); // Initial array
	file2.open("test1");
	file2.read(str2, 21);
	cout << str2;
	file2.close();
	return 0;
}
