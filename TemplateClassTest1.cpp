#include "TemplateHeader1.h"

template <class T>
T Stack<T>::pop(){
	if(top == 0){
		cout << "Stack empty";
		exit(1);
	}
	else{
		top--;
		return stk[top];
	}
}

int main(void)
{
	Stack<char> sch;
	Stack<int> sint;
	sch.push('a');
	sch.push('b');
	sch.push('c');
	sint.push(123);
	sint.push(456);
	sint.push(789);
	cout << "The sequence of pushig characters stack" << endl;
	for(int i = 0;i < 3;i++){
		cout << sch.pop() << endl;
	}
	cout << "The sequence of pushing integer stack" << endl;
	for(int i = 0;i < 3;i++){
		cout << sint.pop() << endl;
	}
	return 0;
}
