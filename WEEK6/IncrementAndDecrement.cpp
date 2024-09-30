#include<iostream>
using namespace std;

int main(){
	int x;
	cout<<"Enter the number ";
	cin>>x;
	int* p=&x;
	cout<<"The value of x before increment is "<<*p<<"."<<endl;
	
	(*p)++;//post increment
	cout<<"The value of x after the post increment is "<<x<<"."<<endl;
	
	++(*p);//pre increment
	cout<<"The value of x after the pre increment is "<<x<<"."<<endl;
	
	--(*p);//pre decrement
	cout<<"The value of x after the pre decrement is "<<x<<"."<<endl;
	
	(*p)--;//post decrement
	cout<<"The value of x after the post decrement is "<<x<<"."<<endl;
	
	return 0;
}
