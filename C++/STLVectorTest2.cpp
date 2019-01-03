#include <iostream>
#include <vector>
#include <stdlib.h>
using namespace std;

int main(void)
{
	vector < vector<int> > array;
	vector <int> emptyvector;
	for(int i = 0;i < 5;i++){
		//row initial
		array.push_back(emptyvector);
		for(int j = 0;j < 5;j++){
			array[i].push_back(j);
			cout << array[i][j] << " ";
		}
		cout << endl;
	}
	return 0;
}
