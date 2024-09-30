#include <iostream>
using namespace std;
void concatenate(char *p, char *q){
	while(*p != '\0'){
		p++;
	}
	while(*q != '\0'){
		*p=*q;
		p++;
		q++;
	}
	*p ='\0';
}

int main() {
	char string1[200], string2[200];
	
	cout << "Enter the first string: ";
	cin.getline(string1,sizeof(string1));
	cout << "Enter the second string: ";
	cin.getline(string2,sizeof(string2));
	concatenate(string1 ,string2);
	cout<<"String after concatination : "<<string1;
	
   return 0;
}
