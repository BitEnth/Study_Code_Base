#include <iostream>
#include <vector>
using namespace std;

int main(void)
{
	vector <int> v;
	vector <int> Initv(10);
	vector <int> InitMax(10, 0);
	cout << "the maximum capacity of no-init vector is " << v.max_size() << endl;
	cout << "the true capacity of no-init vector is " << v.size() << endl;
	cout << "the max capacity of vector Initv is " << Initv.max_size() << endl;
	cout << "the true capacity of vector Initv is " << Initv.size() << endl;
	Initv.resize(20);
	cout << "the true capacity of no-init vector is " << Initv.size() << endl;
	Initv = v;
	if(v.empty()){
		cout << "v is empty" << endl;
	}
	else{
		cout << "v isn't empty" << endl;
	}
	if(InitMax.empty()){
		cout << "InitMax is empty" << endl;
	}
	else{
		cout << "InitMax isn't empty" << endl;
	}
	v.clear();
	return 0;
}
