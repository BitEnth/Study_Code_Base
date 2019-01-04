#include <iostream>
using namespace std;

#pragma pack(1)

struct STU1{
	int num;
	char ch;
	float fnum;
};

struct STU2{
	char ch;
	int num;
	float fnum[3];
};

int main(void)
{
	cout << "the size of STU1: " << sizeof(STU1) << endl;
	cout << "the size of STU2: " << sizeof(STU2) << endl;
	return 0; 
}
