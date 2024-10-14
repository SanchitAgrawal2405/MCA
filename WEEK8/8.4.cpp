#include <iostream>
#include <string>
using namespace std;
int count(string s, char c)
{
	int res = 0;
	for (int i=0;i<s.length();i++)
		if (s[i] == c)
			res++;
	return res;
}
int main()
{
	string str;
	char c ;
	cout<<"Enter the string"<<endl;
	getline(cin,str);
	cout<<"Enter the character to find its occurrence.";
	cin>>c;
	cout <<"The occurrence of "<<c<<" in "<<str<<" is "<< count(str, c) <<" times."<< endl;
	return 0;
}

