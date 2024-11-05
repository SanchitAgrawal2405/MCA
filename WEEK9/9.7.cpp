#include <iostream>
using namespace std;
int MinElement(int array [], int l){
    if(l == 1){
        return array[0];
    }
    
    int remain = MinElement(array, l-1);
    
    if(remain < array[l-1]){
        return remain;
    }
    
    return array[l-1];
}

int MaxElement(int array [], int l){
    if(l == 1){
        return array[0];
    }
    
    int remain = MaxElement(array, l-1);
    
    if(remain < array[l-1]){
        return array[l-1];
    }
    
    
    return remain;
}



int main() {
    int array [] = {23,5,2,67,99,1001,-3,-7};
    int l = sizeof(array)/sizeof(array[0]);
    int min = MinElement(array, l);
    int max = MaxElement(array, l);
    cout<<"Min element of array : "<<min<<endl;
    cout<<"Max element of array : "<<max<<endl;
    return 0;
}
