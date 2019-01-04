#include <iostream>
using namespace std;

class ThrowClass
{
private:
	int m_num;
public:
	ThrowClass(){
		cout << "the construction of ThrowClass" << endl;
		m_num = 10;
	}
	ThrowClass(int num){
		cout << "the reload construction's exception" << endl;
		m_num = num;
		throw num;
	}
	~ThrowClass(){
		cout << "the destruction of ThrowClass" << endl;
		cout << "the pointer exception" << endl;
		//throw &m_num;
	}
};
