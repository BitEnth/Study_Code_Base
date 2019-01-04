#include "ExceptionHeader1.h"

int main(void)
{
	try{
		ThrowClass tc1;
		ThrowClass tc2('a');
		throw tc1;
	}
	catch(int *){
		cout << "catch the exception from destruction" << endl;
	}
	catch(int){
		cout << "catch the exception from construction" << endl;
	}
	catch(ThrowClass){
		cout << "catch the exception of class" << endl;
	}
	catch(...){
		cout << "catch the undefined exception" << endl;
	}
	return 0;
}
