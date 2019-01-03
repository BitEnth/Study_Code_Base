#include <iostream>
#include <iomanip>
using namespace std;

int main(void)
{
	int num = 1234;
	float fnum = 12345.67890;
	cout << dec << num << endl;
	cout << "use octal: " << oct << num << endl;
	cout << "use hexal: " << hex << num << endl;
	cout << "H";
	cout << "E";
	cout << "L" << ends;
	cout << "L";
	cout << "O" << flush;
	cout << "W" << endl;
	cout << "fnum = " << fnum << endl;
	cout << "Set precision to 4" << endl;
	cout << "fnum = " << setprecision(4) << fnum << endl;
	cout << "Set precision to 7" << endl;
	cout << "fnum = " << setprecision(7) << fnum << endl;
	cerr << "2199840124" << endl;
	clog << "jaiqwopo" << endl;
	return 0;
}
