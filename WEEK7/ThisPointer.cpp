#include<iostream>
using namespace std;
class sanchit{
	int value;
	public:
		sanchit(int v):value(v){}
		sanchit& set(){
			value=10;
			return *this;
		}
		void display(){
			cout<<"The value is :"<<value<<endl;
		}
};
int main(){
	int a;
	cout<<"Enter the number : ";
	cin>>a;
	sanchit s(a);
	s.set().display();
	return 0;
}
