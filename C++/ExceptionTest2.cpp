#include <iostream>
using namespace std;

float Division(float num1, float num2){
	if(num2 == 0){
		cout << "invoke abort() " << endl;
		abort();
		return 0;
	}
	else{
		return num1/num2;
	}
}

int main(void)
{
	float num1, num2, quotient;
	cout << "Input float num1 and num2: " << endl;
	cin >> num1 >> num2;
	quotient = Division(num1, num2);
	cout << "num1 / num2 = " << quotient << endl;
	return 0;
}
