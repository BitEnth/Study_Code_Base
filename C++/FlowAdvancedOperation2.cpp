#include <iostream>
using namespace std;

int main(void)
{
	char c;
	int i = 0;
	cout << "Please input characters: ";
	while((c = getchar()) != '\n'){
		i++;
	}
	cout << "\nThe biggest containing bytes of cache\n" << i;
	cout << "\nInput a piece of string: ";
	c = getchar();
	cout << "c = " << c;
	return 0;
}
