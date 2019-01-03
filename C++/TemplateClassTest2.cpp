#include "TemplateHeader2.h"

template <class T>
void Sum<T>::setxy(T a, T b){
	x = a;
	y = b;
}

int main(void)
{
	Sum<int>a(3, 7);
	a.showresult();
	Sum<float>b(3.4, 6.7);
	b.showresult();
	b.setxy(3.9, 9.8);
	b.showresult();
	return 0;
}
