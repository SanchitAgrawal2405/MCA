#include<iostream>
#include<string>
using namespace std;
class pntr_obj{
	string name;
	int roll_no;
	public:
		void set_data(string n, int r){
			name=n;
			roll_no=r;
		}
		void print(){
			cout<<"Object :"<<this<<" has values:"<<this->name<<endl;
		}
};

int main(){
	pntr_obj obj1,obj2,obj3;
	obj1.set_data("Sanchit",101);
	obj2.set_data("Rahul",102);
	obj3.set_data("Ram",103);

	obj1.print();
	obj2.print();
	obj3.print();
	return 0;
}
