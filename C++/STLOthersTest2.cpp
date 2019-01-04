#include <vector>
#include <iostream>
#include <list>
#include <algorithm>
using namespace std;

int main(void)
{
	vector<int> v;
	cout << "initial vector" << endl;
	v.push_back(1);
	v.push_back(3);
	v.push_back(5);
	v.push_back(7);
	list<int> l;
	cout << "initial list" << endl;
	l.push_back(2);
	l.push_back(4);
	l.push_back(6);
	l.push_back(8);
	l.push_back(10);
	cout << "the data of list after copy: " << endl;
	copy(v.begin(), v.end(), l.begin());
	list<int> :: iterator litem;
	for(litem = l.begin();litem != l.end();litem++){
		cout << *litem << " ";
	}
	cout << endl;
	//v.begin()++, v.end()-- . The result will be different.
	fill(v.begin()+1, v.end()-1, 10);
	vector<int> :: iterator vitem;
	for(vitem = v.begin();vitem != v.end();vitem++){
		cout << *vitem << ' ';
	}
	return 0;
}
