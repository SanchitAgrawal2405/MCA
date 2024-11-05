#include <iostream>
using namespace std;

void callbyvalue(int a, int b){
	int temp;
	temp=a;
	a=b;
	b=temp;
	
	cout<<"a = "<<a<<endl;
	cout<<"b = "<<b<<endl;
	return;
}


void callbyreference(int &a, int &b){
	int temp;
	temp=a;
	a=b;
	b=temp;
	
}



int main(){
	int a;
	cout<<"Enter a : ";
	cin>>a;
	int b;
	cout<<"Enter b : ";
	cin>>b;
	
	cout<<"Swap by call by value method : "<<endl;
	callbyvalue(a, b);
	cout<<"Swap by call by reference method : "<<endl;
	callbyreference(a, b);
	cout<<"a = "<<a<<endl;
	cout<<"b = "<<b<<endl;
	
	
}
