#include<iostream>
using namespace std;

int main(){
	int x,y;
	cout<<"Enter first number : ";
	cin>>x;
	cout<<"Enter second number : ";
	cin>>y;
	int* p=&x;
	int* q=&y;
	cout<<"Sum of "<<*p<<" and "<<*q<<" is "<<*p+*q<<endl;
	return 0;
}
