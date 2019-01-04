#include <iostream>
#include <cstring>
using namespace std;

#define SIZE 5

class CSTU
{
private:
	int m_age;
	char m_name[32];
public:
	CSTU(){
		m_age = 12;
		strcpy(m_name, "Barcik");
	}
	CSTU(int age, char *name){
		m_age = age;
		strcpy(m_name, name);
	}
	char *GetName(){
		return m_name;
	}
	int GetAge(){
		return m_age;
	}
};
