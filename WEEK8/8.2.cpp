#include <iostream>
#include<string>
using namespace std;

void isPalindrome (string str) {
    int left = 0, right = str.size() - 1;
      bool flag = true;
    while (left < right) {
        if (str[left] != str[right]) {
            flag = false;
            break;
        }
        left++;
        right--;
    }
      
      if (flag)
        cout << "\"" << str<< "\" is palindrome." << endl;
          
    else
        cout << "\"" << str<< "\" is NOT palindrome." << endl;
}
  

int main() {
    isPalindrome("ABCDCBA");
    isPalindrome("ABCD");            
    return 0;
}

