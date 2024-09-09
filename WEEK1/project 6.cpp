#include <iostream>
using namespace std;
int main(){
	char ch;
	cout<<"Enter any character :";
	cin>>ch;
	switch(ch){
		case 'A'...'Z':
			cout<<endl<<"You entered a CAPITAL letter.";
			break;
		case 'a'...'z':
			cout<<endl<<"You entered a SMALL CASE letter.";
			break;
		case '0'...'9':
			cout<<endl<<"You entered a DIGIT.";
			break;
		default:
			cout<<endl<<"You entered a SPECIAL character.";
	}
	return 0;
}
