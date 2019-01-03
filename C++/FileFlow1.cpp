/* File flow
 * void open(const char* filename, int mode, int access);
 * 
 * Mode:
 * ios::app append
 * ios::ate at end after opening
 * ios::binary
 * ios::in
 * ios::out
 * ios::trunc clean the content of file and set the size to zero
 * 
 * Access:
 * 0 ordinary file
 * 1 read only file
 * 2 hidden file
 * 4 system file
 * */
#include <fstream>
#include <iostream>
using namespace std;

int main(void)
{
	fstream iofile1;
	cout << "use member function open() to open file" << endl;
	iofile1.open("test1", ios::app);
	//cout << "open binary file" << endl;
	//iofile.open("1.jpeg", ios::binary | ios::in | ios::out, 2);
	cout << "use construct function to open file" << endl;
	fstream iofile2("test1", ios::trunc);
	return 0;
}
