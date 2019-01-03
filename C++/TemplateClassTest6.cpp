#include "TemplateHeader6.h"
/* model and friend class & function
 * 
 * using friend class, we can use the object of base class to 
 * visit and modify the private datas in base class directly. But cannot
 * invoke the functions directly, except through objects.
 * friend function can be invoked directly in external class, unnecessary 
 * using objects to invoke.
 * If ordinary external class, i.e., not friend class, we must set a object
 * of base class, then use this object to invoke public functions to visit
 * and modify the private datas in base class.
 * 
 */

int main(void)
{
	cout << "make integer model" << endl;
	Stack<int> int_stack(1, 2);
	cout << "make float model" << endl;
	Stack<double> double_stack(1.2, 3.4);
	CTest test;
	test.fun<int>(int_stack);
	test.fun(int_stack);
	test.change_ctest(int_stack, 10, 11);
	test.fun(int_stack);
	test.fun<double>(double_stack);
	test.fun(double_stack);
	return 0;
}
