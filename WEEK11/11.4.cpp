#include <iostream>
#include <iomanip> 
using namespace std;
void printBinary(int num) {
    if (num == 0) {
        cout << "0";
        return;
    }
    string binary = "";
    while (num > 0) {
        binary = (num % 2 == 0 ? "0" : "1") + binary; 
        num /= 2;
    }
    cout << binary;
}
int main() {
    int number, choice;
    cout << "Enter an integer: ";
    cin >> number;

    do {
        cout << "\n***** MENU *****\n";
        cout << "1. Convert to Binary\n";
        cout << "2. Convert to Octal\n";
        cout << "3. Convert to Hexadecimal\n";
        cout << "4. Exit\n";
        cout << "Enter your choice (1-4): ";
        cin >> choice;

        switch (choice) {
            case 1: {
                cout << "Binary equivalent: ";
                printBinary(number);
                cout << endl;
                break;
            }
            case 2: {
                cout << "Octal equivalent: " << oct << number << endl;
                break;
            }
            case 3: {
                cout << "Hexadecimal equivalent: " << hex << number << endl;
                break;
            }
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

