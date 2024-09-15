#include <iostream>
using namespace std;
int main(){
	int n,arr[100],sum=0;
	cout<<"Enter the number of elements you want to enter in array:";
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	for(int i=0;i<n;i++){
		sum+=arr[i];
	}
	cout<<"The sum of elements of array is : "<<sum<<endl;
	return 0;
}
