/* seekg & seekp
 * istream &seekg(streamoff offset, seek_dir origin)
 * ostream &seekp(streamoff offset, seek_dir origin)
 * seek_dir: 
 * ios::beg beginning of file
 * ios::cur current
 * ios::end end of file*/
#include <iostream>
#include <fstream>
using namespace std;

int main(void)
{
	ofstream file1;
	file1.open("test1");
	file1.write("This is the begin of the file ", 30); //29
	file1.write("C++ stream test ", 16); //15
	file1.write("Test for fileflow5", 16); //18
	file1.close();
	
	ifstream file2;
	char strch[21]; //32
	file2.open("test1");
	cout << "Begin to gain the words:" << endl;
	file2.read(strch, 10);
	cout << strch << endl;  //if the length of strch is too long, it'll be unstable too.  
	file2.seekg(5, ios::beg);
	file2.read(strch, 20);
	cout << "5 bytes after beginning:" << endl;
	cout << strch << endl;  //unstable printing, the last one is random.
	file2.seekg(-15, ios::end);
	file2.read(strch, 10);
	cout << "15 bytes before end:" << endl;
	cout << strch << endl;
	file2.close();
	return 0;
	
}
