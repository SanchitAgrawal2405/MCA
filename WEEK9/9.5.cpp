#include <iostream>
using namespace std;
void DisplayArray(int array [], int l){
    if(l == 0){
        return;
    }
    DisplayArray(array, l-1);
    cout << array[l-1]<<" ";
    return;
}



int main() {
    int array [] = {2,6,8,13,23,45,57,435};
    int l = sizeof(array)/sizeof(array[0]);
    DisplayArray(array, l);

    return 0;
}
