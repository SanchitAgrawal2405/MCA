#include <iostream>
using namespace std;
int reverseNumber(int num) {
    int reversed = 0;
    while (num > 0) {
        reversed = reversed * 10 + (num % 10);  
        num /= 10;  
    }
    return reversed;
}
int sumWithReverse(int num) {
    int reversed = reverseNumber(num);
    return num + reversed;
}
int sumAlternativeDigits(int num) {
    int d1 = num / 1000; 
    int d2 = (num / 100) % 10;  
    int d3 = (num / 10) % 10; 
    int d4 = num % 10;  
    return (d1 + d3) + (d2 + d4);
}

int main() {
    int number, choice;
    cout << "Enter a 4-digit integer: ";
    cin >> number;
    if (number < 1000 || number > 9999) {
        cout << "Please enter a valid 4-digit number." << endl;
        return 1;  
    }
    do {
        cout << "\n***** MENU *****\n";
        cout << "1. Reverse the number\n";
        cout << "2. Sum of number and its reverse\n";
        cout << "3. Sum of alternative digits\n";
        cout << "4. Exit\n";
        cout << "Enter your choice (1-4): ";
        cin >> choice;
        switch (choice) {
            case 1:
                cout << "Reversed number: " << reverseNumber(number) << endl;
                break;
            case 2:
                cout << "Sum of number and its reverse: " << sumWithReverse(number) << endl;
                break;
            case 3:
                cout << "Sum of alternative digits: " << sumAlternativeDigits(number) << endl;
                break;
            case 4:
                cout << "Exiting the program.\n";
                break;
            default:
                cout << "Invalid choice! Please enter a number between 1 and 4.\n";
                break;
        }
    } while (choice != 4);
    return 0;
}

