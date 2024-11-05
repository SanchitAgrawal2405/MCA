#include <iostream>
using namespace std;
int SumOfArray(int array [], int l){
    if(l == 0){
        return 0;
    }
    int remain = SumOfArray(array, l-1);
    int sum = remain + array[l-1];
    return sum;
}



int main() {
    int array [] = {20,21,3,4,5,12,34,6};
    int l = sizeof(array)/sizeof(array[0]);
    int sum = SumOfArray(array, l);
    cout<<"sum of array : "<<sum;
    return 0;
}
