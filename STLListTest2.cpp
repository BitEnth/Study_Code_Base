#include <list>
#include <iostream>
using namespace std;

int main(void)
{
	list <int> mylist;
	list <int>::iterator iter;
	cout << "the capacity of list is " << mylist.size() << endl;
	//resize(int n, element_value), size will become n, 
	//every element's value will become element_value.
	mylist.resize(3, 44);
	cout << "the capacity of list is " << mylist.size() << endl;
	mylist.resize(0, 44);
	
	mylist.push_front(12);
	mylist.push_front(34);
	mylist.push_front(56);
	mylist.push_back(78);
	mylist.push_back(90);
	
	for(iter = mylist.begin();iter != mylist.end();iter++){
		cout << *iter << " ";
	}
	cout << "\n";
	cout << "reverse the list" << endl;
	mylist.reverse();
	for(iter = mylist.begin();iter != mylist.end();iter++){
		cout << *iter << " ";
	}
	cout << "\ndelete the front and rear of list" << endl;
	mylist.pop_front();
	mylist.pop_back();
	for(iter = mylist.begin();iter != mylist.end();iter++){
		cout << *iter << " ";
	}
	return 0;
}
