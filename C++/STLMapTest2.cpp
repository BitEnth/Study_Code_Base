#include <map>
#include <iostream>
using namespace std;

int main(void)
{
	uint i;
	uint maplen;
	map<int, char> mp;
	map<int, char> :: iterator cp;
	mp.insert(pair<int, char>(1, 'A'));
	mp.insert(pair<int, char>(2, 'B'));
	mp.insert(pair<int, char>(3, 'C'));
	mp.insert(pair<int, char>(2, 'D'));
	mp.insert(pair<int, char>(4, 'E'));
	cp = mp.begin();
	// no *cp, use cp->second to get the value.
	cout << "the first element of map: " << cp->second << endl;
	for(cp = mp.begin();cp != mp.end();cp++){
		cout << cp->second << " ";
	}
	cout << endl;
	//do not use 'i <= mp.size()', there is a BUG, will return wrong value.
	//must use a temporary variable to get the size of map.
	maplen = mp.size();
	for(i = 0;i <= maplen;i++){
		cout << "mp[" << i << "] = " << mp[i] << endl;
	}
	cp = mp.end();
	cp--;
	cout << "the last element of map: " << cp->second << endl;
	cp = mp.find(2);
	cout << "the 2nd element: " << cp->second << endl;
	cout << "after deleting 2nd element" << endl;
	mp.erase(cp);
	for(cp = mp.begin();cp != mp.end();cp++){
		cout << cp->second << " ";
	}
	return 0;
}
