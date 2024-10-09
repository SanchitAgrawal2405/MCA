#include<iostream>
using namespace std;
int main(){
	char a[200],*str;
	str=a;
	cout<<"Enter the string."<<endl;
	cin.getline(a,sizeof(a));
	int vowels=0;
	int* s=&vowels;
	while((*str)!='\0'){
		if(*str=='a'||*str=='A'||*str=='e'||*str=='E'||*str=='i'||
		*str=='I'||*str=='o'||*str=='O'||*str=='u'||*str=='U'){
			(*s)++;
		}
		str++;
	}
	cout<<"The total vowels in the given string is : "<<vowels<<endl;
	return 0;
}
