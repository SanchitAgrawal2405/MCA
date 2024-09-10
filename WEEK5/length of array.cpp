#include<iostream>
using namespace std;
int main(){
	int arr[]={3,7,89,34,24,56,87,23,90};
	int len=sizeof(arr)/sizeof(arr[0]);
	cout<<"The given array is : ";
	for(int i=0;i<len;i++){
		cout<<arr[i]<<" ";
	}
	cout<<"\nThe length of the array is : "<<len<<endl;
	return 0;
}
