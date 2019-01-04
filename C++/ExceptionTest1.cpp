#include <cassert>
#include <iostream>
using namespace std;

float division(float num1, float num2){
	assert (num2);
	return num1/num2;
}

int main(void)
{
	float num1, num2, quotient;
	cout << "Input float num1 and num2: " << endl;
	cin >> num1 >> num2;
	quotient = division(num1, num2);
	cout << "num1/num2 = " << quotient << endl;
	cout << "end" << endl;
	return 0;
}
