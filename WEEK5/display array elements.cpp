#include <iostream>
using namespace std;
int main(){
	int n, arr[100];
	cout<<"Enter the number of elements you want to display in array: ";
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	cout<<"The array elements are represented as:"<<endl;
	for(int i=0;i<n;i++){
		cout<<arr[i]<<" ";
	}
	return 0;
}
