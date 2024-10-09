#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int n;
	float s=0.00,m=0.00,d=0.00;
	float* sum=&s;
	float* mean=&m;
	float* sd=&d;
	cout<<"Enter the number of element you want in your string."<<endl;
	cin>>n;
	double a[n],* str;
	str=a;
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	for(int i=0;i<n;i++){
		*sum+=(*str);
		str++;
	}
	*mean=*sum/n;
	for(int i=0;i<n;i++){
		*sd+=pow(a[i]-*mean,2);
	}
	*sd=*sd/n;
	cout<<"The sum of the elements is : "<<s<<endl;
	cout<<"The mean of the elements is : "<<m<<endl;
	cout<<"The standard deviation of the elements is : "<<d<<endl;
	
	return 0;
}
