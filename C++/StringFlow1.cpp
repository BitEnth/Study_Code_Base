/* strstream needs to change to sstream*/
#include <strstream>
#include <iostream>
using namespace std;

int main(void)
{
	cout << "using input flow" << endl;
	istrstream istr("156.7");
	cout << istr.str() << endl;
	
	int a;
	float b;
	istr >> a;
	cout << a << endl;
	istr >> b;
	cout << b << endl;
	cout << "using output flow" << endl;
	ostrstream ostr;
	ostr << a;
	cout << ostr.str() << endl;
	return 0; 
}
