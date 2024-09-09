#include <iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
int add(int x, int y){
	int carry;
	while(y!=0){
		carry=x&y;
		x=x^y;
		y=carry<<1;
	}
	return x;
}
int main(){
	int num1,num2;
	cout<<"Enter first number:";
	cin>>num1;
	cout<<"Enter second number:";
	cin>>num2;
	cout<<"Sum of two number is:"<<add(num1,num2);
	return 0;
	
	
}
