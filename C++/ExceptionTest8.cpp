#include <iostream>
#include <cstdlib>
using namespace std;

int main(void)
{
	float f = 0.0001;
	int i;
	try{
		for(i = 0;i < 45;i++){
			f /= 10;
			cout << "the value of i: " << i << endl;
			cout << "the value of f: " << f << endl;
		}
	}
	catch(underflow_error &error){
		cerr << "Exception: " << error.what() << endl;
	}
	catch(...){
		cout << "undefined exception" << endl;
	}
	return 0;
}
