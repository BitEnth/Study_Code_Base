#include "ModifSymbolTestH.h"
extern int extern_num;
int tnum;
int main(void)
{
	cout << "The address of extern_num in cpp: " << &extern_num << endl;
	cout << "The address of num in cpp: " << &num << endl;
	cout << "The address of tnum in cpp: " << &tnum << endl;
	ShowAddreess();
	return 0;
}
