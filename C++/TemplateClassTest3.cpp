#include "TemplateHeader3.h"

int main(void)
{
	B<int, double> b;
	b.funcb(1, 1.5);
	b.funca(1.3);
	A<int> a =static_cast< A<int> >(b);
	a.funca(2);
	return 0;
}
