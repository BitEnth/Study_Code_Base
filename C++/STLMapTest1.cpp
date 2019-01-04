#include <map>
#include <iostream>
using namespace std;

int main(void)
{
	map<int, char> mp;
	cout << "the maximum capacity of map is: " << mp.max_size() << endl;
	if(mp.empty()){
		cout << "map is null" << endl;
	}
	else{
		cout << "map is not null" << endl;
	}
	mp.insert(pair<int, char>(1, 'a'));
	mp.insert(pair<int, char>(2, 'b'));
	mp.insert(pair<int, char>(3, 'c'));
	mp.insert(pair<int, char>(2, 'd'));
	cout << "the number of elements whose key is 1 in map: " << mp.count(1) << endl;
	cout << "the number of elements whose key is 2 in map: " << mp.count(2) << endl;
	cout << "the number of elements whose key is 3 in map: " << mp.count(3) << endl;
	cout << "the amount of elements in map: " << mp.size() << endl;
	mp.clear();
	cout << "after clearing the map, the amount of elements: " << mp.size() << endl;
	return 0;
}
