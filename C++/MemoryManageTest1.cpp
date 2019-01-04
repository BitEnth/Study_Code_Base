#include "MemoryManageHeader1.h"

int main(void)
{
	int *p, *pNum;
	int i;
	
	p = new int;
	cout << "input a integer" << endl;
	cin >> *p;
	cout << "the value of *p: " << *p << endl;
	
	pNum = new int[SIZE];
	for(i = 0;i < SIZE;i++){
		*(p+i) = i*2+1; 
	}
	cout << "the array pNum[] " << endl;
	for(i = 0;i < SIZE;i++){
		cout << *(p+i) << " ";
	}
	cout << endl;
	
	CSTU *pClass = new CSTU;
	cout << "the address of pClass: " << pClass << endl;
	cout << pClass->GetName() << endl;
	
	cout << "the size of p, pNum & pClass: ";
	cout << sizeof(p) << " " << sizeof(pNum) << " " << sizeof(pClass) << endl;
	cout << sizeof(*p) << " " << sizeof(*pNum) << " " << sizeof(*pClass) << endl;
	
	delete p;
	delete []pNum;
	delete pClass;
	return 0;
}
