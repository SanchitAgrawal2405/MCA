#include <iostream>
using namespace std;
int main(){
	int num,r,sum=0,ArmNum;
	cout<<"Enter number to check Armstrong number ";
	cin>>num;
	ArmNum = num;
	while(num > 0){
		r = num % 10;
		sum = sum + (r * r * r);
		num = num/10;
	}
	if(ArmNum == sum)
	cout<<"Entered number is Armstrong Number."<<endl;
	else
	cout<<"Entered number is not Armstrong Number."<<endl;
	return 0;
}
