#include<iostream>
using namespace std;
int count(char* str){
	int c=0;
	while((*str)!='\0'){
		c++;
		str++;
		if((*str)==' '){
			c--;
		}
	}
	return c;
}

int main(){
	char a[200];
	cout<<"Enter the string."<<endl;
	cin.getline(a,sizeof(a));
	cout<<"Length of given string is : "<<count(a)<<endl;
	
	return 0;
}
