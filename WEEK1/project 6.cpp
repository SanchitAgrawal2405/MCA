#include <iostream>
using namespace std;
int main(){
	char ch;
	cout<<"Enter any character :";
	cin>>ch;
	int c=(int)ch;
	if(c>=65 && c<=90)
	cout<<endl<<"You entered a CAPITAL letter.";
	else if(c>=97 && c<=122)
	cout<<endl<<"You entered a SMALL CASE letter.";
	else if(c>=48 && c<=57)
	cout<<endl<<"You entered a DIGIT.";
	else
	cout<<endl<<"You entered a SPECIAL character.";
	return 0;s	
}
