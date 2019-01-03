#include <iostream>
#include <fstream>

using namespace std;

int main(void)
{
	ofstream file1;
	char str[16] = "C++ stream test";
	int i;
	file1.open("test1");
	for(i = 0;str[i] != '\0';i++){
		file1.put(str[i]);
	}
	file1.close();
	
	ifstream file2;
	char ch;
	char str2[32];
	file2.open("test1");
	file2.get(str2, 3);
	cout << "use reload function get():" << endl;
	cout <<  str2 << endl;
	file2.get(str2, 10, 'e');
	cout << "use reload get():" << endl;
	cout << str2 << endl;
	cout << "the rest words:" << endl;
	while(file2.get(ch)){
		cout << ch;
	}
	file2.close();
	return 0;
}
