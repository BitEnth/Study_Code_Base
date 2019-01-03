#include <iostream>
#include <stdlib.h>
using namespace std;

const int SIZE = 10;

template <class T>
class Stack
{
private:
	T stk[SIZE];
	int top;
public:
	Stack(){
		top = 0;
	}
	void push(T ob){
		if(top == SIZE){
			cout << "Stack full";
			return;
		}
		else{
			stk[top] = ob;
			top++;
		}
	}
	T pop();
};
