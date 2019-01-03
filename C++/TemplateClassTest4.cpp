#include "TemplateHeader4.h"

int main(void)
{
	A a(3, 8);
	a.displaya();
	B <int> b1(1, 2, 5, 9);
	b1.displayb();
	b1.displaya();
	B <double> b2(1, 2, 9.5, 8.9);
	b2.displayb();
	b2.show();
	return 0;
}
