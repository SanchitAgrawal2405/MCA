#include <iostream>
using namespace std;
int main(){
	int n;
	cout<<"Enter upto where you want the Fibonnaci sequence:  ";
	cin>>n;
	if(n<=0){
		cout<<"Enter a valid number";
	}
	int n1=0,n2=1,n3;
	int i;
	for(i=2;i<n;++i){
		cout<<n1<<" "<<n2<<" ";
		n3=n1+n2;
		cout<<n3<<" ";
		n1=n2;
		n2=n3;
	}

	return 0;
}
