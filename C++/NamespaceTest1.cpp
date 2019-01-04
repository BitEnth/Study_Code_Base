#include "NamespaceHeader1.h"

namespace s1 = space1;
namespace s2 = space2;
using namespace s1;
using namespace s2;

int main(void)
{
	using s1::shownum;
	//using s1::snum1;
	cout << "use namespace space1's variables and function" << endl;
	shownum();
	
	using s2::shownum;
	cout << "use namespace space2's function" << endl;
	s2::shownum();
	s1::num = 192;
	s2::num = 675;
	cout << "s1's num + s2's num = " << s1::num + s2::num << endl;
	return 0;
}
