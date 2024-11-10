#include <iostream> 
using namespace std;
int main() {
    double num1, num2, result;
    int choice; 
    do {
        cout << "***** MENU *****\n";
        cout << "1. Addition\n";
        cout << "2. Subtraction\n";
        cout << "3. Multiplication\n";
        cout << "4. Division\n";
        cout << "5. Exit\n";
        cout << "Enter your choice (1-5): ";
        cin >> choice;
        if (choice >= 1 && choice <= 4) {
            cout << "Enter first number: ";
            cin >> num1;
            cout << "Enter second number: ";
            cin >> num2;
            switch (choice) {
                case 1: 
                    result = num1 + num2;
                    cout << "Result: " << num1 << " + " << num2 << " = " << result << endl;
                    break;
                case 2: 
                    result = num1 - num2;
                    cout << "Result: " << num1 << " - " << num2 << " = " << result << endl;
                    break;
                case 3: 
                    result = num1 * num2;
                    cout << "Result: " << num1 << " * " << num2 << " = " << result << endl;
                    break;
                case 4: 
                    if (num2 != 0) {
                        result = num1 / num2;
                        cout << "Result: " << num1 << " / " << num2 << " = " << result << endl;
                    } else {
                        cout << "Error: Division by zero is not allowed!" << endl;
                    }
                    break;
            }
        } else if (choice == 5) {
            cout << "Exiting the program.\n";
        } else {
            cout << "Invalid choice! Please enter a number between 1 and 5.\n";
        }
        cout << endl; 
    } while (choice != 5); 
    return 0;
}

