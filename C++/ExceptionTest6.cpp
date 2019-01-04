#include <iostream>
using namespace std;

int main(void)
{
	try{
		try{
			cout << "throw integer exception" << endl;
			throw 0;
		}
		catch(int i){
			cout << "catch the exception, rethrow integer exception" << endl;
			//throw;
			throw "jasdk";
		}
		catch(...){
			cout << "undefined inner exception" << endl;
		}
	}
	catch(int i){
		cout << "catch the inner exception" << endl;
	}
	catch(...){
		cout << "catch the undefined inner exception" << endl;
	}
	return 0;
}
