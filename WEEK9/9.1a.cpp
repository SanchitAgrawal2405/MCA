#include <iostream>
using namespace std;
int recurfactorial(int a){
    if(a == 1){
        return 1;
    }
    
    int remain = recurfactorial(a-1);
    
    int fact = remain * a;
    return fact;
}

int nonrecurfact(int a){
    int fact = 1;
    for(int i=1; i<= a; i++){
        fact = fact * i;
    }
    return fact;
}

int main() {
    int a;
    cout<< "Enter a no ";
    cin>> a;
    int f = recurfactorial(a);
    cout<< "Factorial of "<<a<<" using recurion is "<<f<<endl;
    
    
    int x = nonrecurfact(a);
    cout<<"Factorial using non recursive approach is "<<x<<endl;
    return 0;
}
