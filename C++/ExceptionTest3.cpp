#include <iostream>
#define ZERO 0
#define SIZE 10
#define ARRAYERROR "exceed the range of this array"
using namespace std;

float Divis(float num1, float num2){
	if(num2 == 0){
		cout << "throw the integer exception" << endl;
		throw ZERO;
		return 0;
	}
	else{
		return num1/num2;
	}
}

void Array_visit(int num[], int position){
	if(position > SIZE-1){
		throw &position;
	}
	else{
		cout << num[position] << endl;
	}
}

int main(void){
	float num1, num2;
	int a[SIZE] = {98, 90, 28, 19, 34, 89, 29, 23, 49, 56};
	int pos;
	cout << "input two float numbers" << endl;
	cin >> num1 >> num2;
	cout << Divis(num1, num2) << endl;
	cout << "input the subscript of this array" << endl;
	cin >> pos;
	try{
		Array_visit(a, pos);
	}
	catch(int *){
		cout << "catch the exception of pointer" << endl;
	}
	cout << "what's the hell" << endl;
	return 0;
}
