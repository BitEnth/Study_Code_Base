#include <list>
#include <iostream>
using namespace std;

int main(void)
{
	list <int> mylist(4);
	if(mylist.empty()){
		cout << "list is empty" << endl;
	}
	else{
		cout << "list is not empty" << endl;
	}
	mylist.push_front(12);
	mylist.push_front(34);
	mylist.push_front(56);
	cout << mylist.front() << endl;
	mylist.clear();
	if(mylist.empty()){
		cout << "list is empty" << endl;
	}
	else{
		cout << "list is not empty" << endl;
	}
	return 0;
}
