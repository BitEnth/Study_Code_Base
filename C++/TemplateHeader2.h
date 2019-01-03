#include <iostream>
using namespace std;

template <class T>
class Sum
{
private:
	T x, y;
public:
	/* constructure function, using a list to initial variable
	 * It's different from initial by assignment, just like that:
	 * Sum(){ x = 0;y = 0 }
	 * see https://blog.csdn.net/fengxinlinux/article/details/70146347
	 */
	Sum(T a = 0, T b = 0):x(a), y(b){}
	void setxy(T, T);
	void showresult(){
		cout << "The summary of two numbers" << endl;
		cout << x+y << endl;
	}
};

