#include <iostream>
using namespace std;

void nonrecursive_gcd(int a, int b){
    int gcd =1;
    if(a>b){
        for(int i = 1; i<= b; i++){
            if(a%i == 0 && b%i == 0){
                if(i>gcd){
                    gcd = i;
                }
            }
        }
        cout<<gcd<<" is the greatest common divisor using non recursive method";
        
    }
    else{
        for(int i = 1; i<= a; i++){
            if(a%i == 0 && b%i == 0){
                if(i>gcd){
                    gcd = i;
                }
            }
        }
        cout<<gcd<<" is the greatest common divisor using non recursive method";
    }
}

int recursive_gcd(int a, int b){
    if(a>b){
        if(b==1){
            return 1;
        }
        int temp = recursive_gcd(a, b-1);
        if(a%b == 0){
            return b;
        }
        
        return temp;
    }
    if(a<b){
        if(a==1){
            return 1;
        }
        int temp = recursive_gcd(a-1, b);
        if(b%a == 0){
            return a;
        }
        
        return temp;
    }
    return 1;
}

int main() {
    
    int a, b;
    
    cout<<"Enter two integers : "<<endl;
    cin>>a>>b;
    nonrecursive_gcd(a,b);
    cout<<endl;
    int rgcd = recursive_gcd(a,b);
    cout<<rgcd<<" is the greatest common divisor using recursive method";
    return 0;
}
