#include <iostream>
using namespace std;
int main(){
	int a[20],n,x,i,count=0;
	cout<<"Enter the size of the array:"<<endl;
	cin>>n;
	cout<<"Enter the elements"<<endl;
	for(i=0;i<n;i++)
	cin>>a[i];
	cout<<"enter to check its frequency:"<<endl;
	cin>>x;
	for(i=0;i<n;i++)
	if(a[i]==x)
	count++;
	cout<<"frequency of "<<x<<" is: "<<count<<endl;
	return 0;
}
