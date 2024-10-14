#include <iostream>
#include<string>
using namespace std;
int findSubstring(string S1, string S2) {
    int M = S1.length();
    int N = S2.length();
    for (int i = 0; i <= N - M; i++) {
    	int j;
        for ( j = 0; j < M; j++) {
            if (S2[i + j] != S1[j]) {
                break; 
            }
        }
        if (j == M) {
            return i; 
        }
    }
    return 1; 
}

int main() {
    string S1 , S2;
    cout<<"Enter the string."<<endl;
    getline(cin,S2);
    cout<<"Enter the string to be searched."<<endl;
    getline(cin,S1);
    int result = findSubstring(S1, S2);
    
    if (result != 1) {
        cout << result << endl;
    } else {
        cout << 1 << endl;
    }

    return 0;
}

