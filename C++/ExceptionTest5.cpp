#include "ExceptionHeader2.h"

int main(void)
{
	int errorcode;
	MyException myex(10);
	MyException *pmyex = &myex;
	myex.showError();
	cout << "Input the error code:" << endl;
	cin >> errorcode;
	try{
		if(errorcode == 1){
			throw &myex;
		}
		else if(errorcode == 2){
			throw myex;
		}
		else if(errorcode == 3){
			throw pmyex;
		}
		else{
			throw myex.getErrorID();
		}
	}
	catch(int){
		cout << "catch the integer exception" << endl;
	}
	catch(MyException e){
		cout << "catch the object exception" << endl;
	}
	catch(MyException *e){
		cout << "catch the pointer exception" << endl;
	}
	catch(...){
		cout << "undefined exception" << endl;
	}
	return 0;
}
