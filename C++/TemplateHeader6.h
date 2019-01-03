#include <iostream>
using namespace std;

template <typename T>
class Stack
{
private:
	int count;
	int top;
public:
	friend class CTest;
	friend void print_stack(const Stack &ts){
		cout << "Print():this->count = " << ts.count << ", this->top = " << ts.top << endl;
	}
	Stack(int c = 0, int t = 0):count(c), top(t){
		cout << "construction complete" << endl;
	}
	void s_Print(){
		cout << "s_Print():this->count = " << count << ", this->top = " << top << endl;
	}
};

class CTest
{
public:
	template <typename T>
	void fun(const Stack<T> &ts){
		cout << "A::this->count = " << ts.count << ", this->top = " << ts.top << endl;
	}
	void change_ctest(Stack<int> &s1, int a, int b){
		s1.count = a;
		s1.top = b;
	}
};

class DTest
{
public:
	void change_dtest(Stack<int> s1, int a, int b){
		//s1.count = a;
		//s1.top = b;
		s1.s_Print();
	}
	void print_dtest(Stack<int>s1){
		print_stack(s1);
	}
};

