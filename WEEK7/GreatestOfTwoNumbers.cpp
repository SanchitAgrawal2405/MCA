#include<iostream>
using namespace std;
class largest{
	int n1;
	int n2;
	public:
		void find(int n,int m){
			n1=n;
			n2=m;
		}
		void display(){
			if(this->n1 > this->n2){
				cout<<"The largest number is : "<<this->n1<<endl;
			}
			else if(this->n1==this->n2){
				cout<<"Both numbers are equal."<<endl;
			}
			else{
				cout<<"The largest number is : "<<this->n2<<endl;
			}
		}
};

int main(){
	int p,q;
	cout<<"Enter the first number : ";
	cin>>p;
	cout<<"Enter the second number : ";
	cin>>q;
	largest y;
	y.find(p,q);
	y.display();
	return 0;
}
