#include <iostream>
using namespace std;
int main(){
	int n,odd=0,even=0,positive=0,negative=0,zero=0,i,arr[20];
	cout<<"Enter number of elements between 1 to 20 you want in an array: ";
	cin>>n;
	for(i=0;i<n;i++){
		cin>>arr[i];
	}
	for(i=0;i<n;i++){
		if(arr[i]>0)
		    positive++;
		else if(arr[i]==0)
		    zero++;
		else
		    negative++;
	}
	for(int i =0;i<n;i++){
	 if(arr[i]%2==0)
			   even++;
	 else
	     odd++;
	}
	
	cout<<"\nFrequency of Positive Numbers:"<<positive;
	cout<<"\nFrequency of Zero:"<<zero;
	cout<<"\nFrequency of Negative Numbers:"<<negative;
	cout<<"\nFrequency of Even Numbers:"<<even;
	cout<<"\nFrequency of Odd Numbers:"<<odd;
	cout<<endl;
	return 0;
}
