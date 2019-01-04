#include <iostream>
using namespace std;

namespace space1
{
	int snum1 = 10;
	int num;
	void shownum(){
		cout << "In namespace space1, the value of snum is " << snum1 << endl;
	}
}

namespace space2
{
	int snum2 = 20;
	int num;
	void shownum(){
		cout << "In namespace space2, the value of snum is " << snum2 << endl;
	}
}
