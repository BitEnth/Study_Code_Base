#include <iostream>
using namespace std;

class MyException : public exception
{
private:
	int m_errorID;
public:
	MyException(int errorid){
		cout << "the construction" << endl;
		m_errorID = errorid;
	}
	~MyException(){
		cout << "the destruction" << endl;
	}
	int getErrorID(){
		return m_errorID;
	}
	void showError(){
		cout << "1. throw a pointer of the class" << endl;
		cout << "2. throw an object of the class" << endl;
		cout << "3. throw a reference of the class " << endl;
		cout << "Others. throw the integer exception " << endl;
	}
};
