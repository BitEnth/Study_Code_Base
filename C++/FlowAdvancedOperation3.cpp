#include <iostream>
using namespace std;

int main(void)
{
	int num;
	cout << "Normal and innormal situation. Input a word or number: ";
	cin >> num;
	cout << "Invoke rdstate: " << cin.rdstate() << endl;
	cout << "Invoke eof: " << cin.eof() << endl;
	cout << "Invoke fail: " << cin.fail() << endl;
	cout << "Invoke bad: " << cin.bad() << endl;
	cout << "Invoke good: " << cin.good() << endl;
	cout << "Invoke clear ";
	cin.clear();
	cout << "\nInvoke fail: " << cin.fail() << endl;
	cout << "Invoke good: " << cin.good() << endl;
	return 0;
}
