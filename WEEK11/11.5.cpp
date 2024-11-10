#include <iostream>
using namespace std;
double add(double num1, double num2) {
    return num1 + num2;
}
double subtract(double num1, double num2) {
    return num1 - num2;
}
double multiply(double num1, double num2) {
    return num1 * num2;
}
double divide(double num1, double num2) {
    if (num2 == 0) {
        cout << "Error: Division by zero is not allowed!" << endl;
        return 0;
    }
    return num1 / num2;
}
int main() {
    double num1, num2, result;
    int choice;
    cout << "Enter first number: ";
    cin >> num1;
    cout << "Enter second number: ";
    cin >> num2;

    do {
        cout << "\n***** MENU *****\n";
        cout << "1. Addition\n";
        cout << "2. Subtraction\n";
        cout << "3. Multiplication\n";
        cout << "4. Division\n";
        cout << "5. Exit\n";
        cout << "Enter your choice (1-5): ";
        cin >> choice;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                cout << "Result: " << num1 << " + " << num2 << " = " << result << endl;
                break;
            case 2:
                result = subtract(num1, num2);
                cout << "Result: " << num1 << " - " << num2 << " = " << result << endl;
                break;
            case 3:
                result = multiply(num1, num2);
                cout << "Result: " << num1 << " * " << num2 << " = " << result << endl;
                break;
            case 4:
                result = divide(num1, num2);
                if (num2 != 0) {
                    cout << "Result: " << num1 << " / " << num2 << " = " << result << endl;
                }
                break;
            case 5:
                cout << "Exiting the program.\n";
                break;
            default:
                cout << "Invalid choice! Please enter a number between 1 and 5.\n";
                break;
        }
    } while (choice != 5); 

    return 0;
}

