#include <iostream>
using namespace std;
int main(){
    int n;
    int arr[20];
    cout<<"Enter the number between 1 to 20 to initialize the array elements : ";
    cin>>n;
    for(int i=0;i<n;i++){
    	cin>>arr[i];
				}
    int temp;
    for(int i = 0; i<n/2; i++){
        temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
    }
    for(int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
}
