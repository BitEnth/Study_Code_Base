#include <iostream>
#include <deque>
using namespace std;

int main(void)
{
	deque <int> de;
	uint i;
	de.push_back(10);
	de.push_back(20);
	de.push_front(30);
	de.push_front(40);
	for(i = 0;i < de.size();i++){
		cout << de[i] << " ";
	}
	return 0;
}
