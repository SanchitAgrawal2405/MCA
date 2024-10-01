#include<iostream>
using namespace std;

int main(){
	int arr1[10];
	int* ptr1,*ptr2;
	ptr1=ptr2=arr1;
	cout<<"Enter the elements of array."<<endl;
	for(int i=0;i<10;i++){
		cout<<"element "<<i+1<<" : ";
		cin>>*ptr1;
		ptr1++;
	}
	cout<<"Displaying the elements of array. \n";
	for(int i=0;i<10;i++){
		cout<<*ptr2<<" ";
		ptr2++;
	}
	return 0;
}
