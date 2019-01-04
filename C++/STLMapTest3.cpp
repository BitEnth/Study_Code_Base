#include <map>
#include <iostream>
using namespace std;

int main(void)
{
	int i;
	map<int, int> mp1, mp2, mp3;
	for(i = 1; i <= 4;i++){
		mp1[i] = i;
		mp2[i] = i;
		mp3[i] = i+1;
	}
	if(mp1 == mp2){
		cout << "mp1 is the same as mp2" << endl;
	}
	else{
		cout << "mp1 differs from mp2" << endl;
	}
	if(mp1 > mp3){
		cout << "mp1 > mp3" << endl;
	}
	else{
		cout << "mp1 < mp3" << endl;
	}
	mp2[1] = 10;
	if(mp2 > mp3){
		cout << "mp2 > mp3" << endl;
	}
	else{
		cout << "mp2 < mp3" << endl;
	}
}
