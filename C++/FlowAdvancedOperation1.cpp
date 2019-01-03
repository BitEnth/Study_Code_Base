#include <iostream>
#include <fstream>
using namespace std;

int main(void)
{
	string str("123");
	ofstream fout("test1");
	cout << "The pointer's location in file before writing: " ;
	cout << fout.tellp() << endl;
	int i;
	for(i = 0;i < 3;i++){
		cout << "The pointer's location in file: " << fout.tellp() << endl;
		fout.put(str[i]);
	}
	cout << "The pointer's location after finishing writing: ";
	cout << fout.tellp() << endl;
	fout.put('5');
	fout.seekp(0, fstream::beg);
	cout << "Reset the location of pointer in file: " << fout.tellp() << endl;
	fout.put('5');
	fout.close();
	
	FILE *fp;
	char buf[64];
	fp = fopen("test1", "a+");
	cout << fgets(buf, 64, fp) << endl;
	fclose(fp);
	return 0;
}
