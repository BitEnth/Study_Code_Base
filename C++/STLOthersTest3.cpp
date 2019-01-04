#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

int main(void)
{
	vector<int> v;
	cout << "initial vector" << endl;
	v.push_back(89);
	v.push_back(67);
	v.push_back(36);
	v.push_back(90);
	v.push_back(54);
	vector<int> :: iterator ilocation;
	cout << "show the elements of vector" << endl;
	for(ilocation = v.begin();ilocation != v.end();ilocation++){
		cout << *ilocation << ' ';
	}
	cout << endl;
	make_heap(v.begin(), v.end());
	cout << "add new element" << endl;
	v.push_back(41);
	push_heap(v.begin(), v.end());
	cout << "show the elements after creating heap" << endl;
	for(ilocation = v.begin();ilocation != v.end();ilocation++){
		cout << *ilocation << ' ';
	}
	cout << endl;
	pop_heap(v.begin(), v.end());
	for(ilocation = v.begin();ilocation != v.end();ilocation++){
		cout << *ilocation << ' ';
	}
	cout << endl;
	sort_heap(v.begin(), v.end());
	for(ilocation = v.begin();ilocation != v.end();ilocation++){
		cout << *ilocation << ' ';
	}
	cout << endl;
	return 0;
}
