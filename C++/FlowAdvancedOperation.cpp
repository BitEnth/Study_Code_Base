#include <iostream>
#include <fstream>
#include <stdlib.h>
using namespace std;

int main(void)
{
	FILE *fp;
	char buf[64];
	cout << "open the file" << endl;
	fp = fopen("test1", "a+");
	if(fp == NULL){
		cout << "fail to open file" << endl;
		exit(1);
	}
	cout << "input string '12344' after opening a file" << endl;
	fputs("12344\n", fp);
	cout << "read from the file" << endl;
	cout << fgets(buf, 64, fp) << endl;
	cout << "close the file" << endl;
	fclose(fp);
	return 0;
}
