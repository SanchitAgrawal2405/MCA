#include<iostream>
using namespace std;

int main(){
	char x[100];
	char *p;
	cout<<"Enter the string ";
	cin.getline(x,sizeof(x));
	p=x;
	while(*p != '\0'){
		cout<<*p;
		p++;
	}
	
	return 0;
}
