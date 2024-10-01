#include <string.h>
#include <iostream>
using namespace std;
int main(){
   char a[200], *str;
   str=a;
   cout<<"Enter the string."<<endl;
   cin.getline(a,sizeof(a));
   cout<<"original string::"<<str;
   cout<<endl<<"String after reverse::";
   for(int i=(strlen(str)-1);i>=0;i--){
      cout<<str[i];
   }
   return 0;
}
