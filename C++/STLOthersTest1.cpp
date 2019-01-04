#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(void)
{
	int num_to_find = 6;
	vector<int> v1;
	vector<int> v2;
	int i;
	for(i = 0;i < 6;i++){
		v1.push_back(2*i);
		cout << v1[i] << " ";
	}
	cout << endl;
	for(i = 0;i < 4;i++){
		v2.push_back(i+7);
		cout << v2[i] << " ";
	}
	cout << endl;
	vector<int> :: iterator result;
	result = find(v1.begin(), v1.end(), num_to_find);
	if(result == v1.end()){
		cout << "fail to find " << num_to_find << endl;
	}
	else{
		cout << num_to_find << " is Number " << result-v1.begin() << endl;
	}
	int vector_size = 2;
	cout << "the amount of " << vector_size << " is ";
	cout << count(v1.begin(), v1.end(), vector_size) << endl;
	vector<int> :: iterator ilocation;
	ilocation = search(v1.begin(), v1.end(), v2.begin(), v2.end());
	cout << ilocation-v1.begin() << endl;
	return 0;
}
