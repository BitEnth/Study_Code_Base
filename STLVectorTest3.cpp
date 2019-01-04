#include <iostream>
#include <vector>
#include <stdlib.h>
using namespace std;

int main(void)
{
	vector <int> v;
	cout << "insert 10, 20, 30 to vector" << endl;
	v.push_back(10);
	v.push_back(20);
	v.push_back(30);
	vector <int>::iterator pitem;
	for(pitem = v.begin();pitem != v.end();pitem++){
		cout << *pitem << " ";
	}
	pitem = v.begin();
	for(uint i = 0;i < v.size();i++, pitem++){
		if(*pitem == 20){
			pitem = v.erase(pitem);
			break;
		}
	}
	cout << endl;
	for(uint i = 0;i < v.size();i++){
		cout << v[i] << " ";
	}
	return 0;
}
