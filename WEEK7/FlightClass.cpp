#include<iostream>
#include<string>
using namespace std;
class flight{
	int flight_no;
	string source;
	string destination;
	int fare;
	public:
		void get_data(int fn, string s, string d, int f){
			flight_no=fn;
			source=s;
			destination=d;
			fare=f;
		}
		void display(){
			cout<<"FLIGHT INFORMATION:"<<endl;
			cout<<"The flight number is : "<<this->flight_no<<endl;
			cout<<"The source of flight is : "<<this->source<<endl;
			cout<<"The destination of flight is : "<<this->destination<<endl;
			cout<<"The fare of flight is : "<<this->fare<<endl;
			
		}
};
int main(){
	flight airbus;
	airbus.get_data(101,"Delhi","Chennai",100000);
	airbus.display();
	return 0;
}
