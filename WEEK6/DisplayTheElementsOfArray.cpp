#include <iostream>
using namespace std;
int main() {
   int arr[10],*ptr1,*ptr2;
   ptr1=ptr2=arr;
   cout<<"Enter the value of elements of array."<<endl;
   for(int i=0;i<10;i++){
   	cout<<"Enter the "<<i+1<<" element : ";
   	cin>>*ptr1;
   	ptr1++;
   }
   cout<<"The values in the array are: ";
   for(int i = 0; i < 10; i++) {
      cout<< *ptr2 <<" ";
      ptr2++;
   }
   return 0;
}
