#include<iostream>
using namespace std;

int main(){
	char a[200],*str;
	str=a;
	int c=0;
	int* y=&c;
	cout<<"Enter the string."<<endl;
	cin.getline(a,sizeof(a));
	while((*str)!='\0'){
		(*y)++;
		str++;
		if((*str)==' '){
			(*y)--;
		}
	}
	cout<<"Length of given string is : "<<c<<endl;
	
	return 0;
}
