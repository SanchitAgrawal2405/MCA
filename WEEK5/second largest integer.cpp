#include <climits>
#include <iostream>
using namespace std;

int main()
{
    int y, array[20];
    cout<<"Enter the number of elements you want in your array(between 1-20) "<<endl;
    cin>>y;
    for(int i=0;i<y;i++){
    	cin>>array[i];
			}

    int first = INT_MIN, second = INT_MIN;

    for (int i = 0; i < y; i++) {
        if (array[i] > first) {
            second = first;
            first = array[i];
        }
        else if (array[i] > second && array[i] < first) {
            second = array[i];
        }
    }

    cout << "Second Largest Element in the Array: "
         << second << endl;

    return 0;
}

