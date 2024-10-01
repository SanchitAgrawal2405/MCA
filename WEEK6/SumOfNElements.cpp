#include<iostream>
using namespace std;

int main(){
	int a[5],*ptr,sum=0;
	cout<<"Enter the elements of array.\n"<<endl;
	ptr=a;
	for(int i=0;i<5;i++){
		cout<<"Enter the "<<i+1<<" element : ";
		cin>>*ptr;
		sum+=*ptr;	
	}
	cout<<"The sum of array elements is "<<sum<<"."<<endl;
	return 0;
}
