#include<iostream>
#include<string>
using namespace std;
string replace(string s, char c1, char c2)
{
	int l = s.length();
	for (int i = 0; i < l; i++) 
	{
		if (s[i] == c1)
			s[i] = c2;
		else if (s[i] == c2)
			s[i] = c1;
	}
	return s;
}
int main()
{
	string s;
	cout<<"Enter the string ";
	getline(cin,s);
	char c1 = 'e', c2 = 'r';
	cout << replace(s, c1, c2);
	return 0;
}

