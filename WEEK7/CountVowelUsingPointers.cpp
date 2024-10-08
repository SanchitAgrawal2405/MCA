#include<iostream>
using namespace std;
int count(char* str){
	int vowels=0;
	while((*str)!='\0'){
		if(*str=='a'||*str=='A'||*str=='e'||*str=='E'||*str=='i'||
		*str=='I'||*str=='o'||*str=='O'||*str=='u'||*str=='U'){
			vowels++;
		}
		str++;
	}
	return vowels;
}
int main(){
	char a[200];
	cout<<"Enter the string."<<endl;
	cin.getline(a,sizeof(a));
	cout<<"The total vowels in the given string is : "<<count(a)<<endl;
	return 0;
}
