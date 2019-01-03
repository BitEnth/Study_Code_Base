#include "TemplateHeader5.h"

int main(void)
{
	C c(133, 135, 138);
	cout << "use Base A's function" << endl;
	c.showa();
	cout << "use Base B's function" << endl;
	c.showb();
	cout << "use C's function" << endl;
	c.showc();
	return 0;
}
