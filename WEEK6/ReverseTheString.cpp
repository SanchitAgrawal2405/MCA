#include <string.h>
#include <iostream>
using namespace std;
int main(){
   char a[200], *str,b[200],temp,*begin,*end;
   char x;
   str=a;
   cout<<"Enter the string."<<endl;
   cin.getline(a,sizeof(a));
   cout<<"original string::"<<str;
   int len,n;
   len=strlen(str);
   n=len-1;
   begin=str;
   end=str+n;
   cout<<endl<<"String after reverse::";
   for(int i=0;i<=(len/2);i++){
   	temp=*begin;
   	*begin=*end;
   	*end=temp;
   	begin++;
   	end--;
   }
   cout<<str<<endl;
   return 0;
}
