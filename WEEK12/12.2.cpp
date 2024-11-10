#include <iostream>
using namespace std;
class Calculator {
private:
    double num1, num2, num3, num4; 
public:
    Calculator() {
        num1 = num2 = num3 = num4 = 0;  
    }
    Calculator(double a, double b, double c, double d) {
        num1 = a;
        num2 = b;
        num3 = c;
        num4 = d;
    }
    double add() {
        return num1 + num2 + num3 + num4;
    }
    double subtract() {
        return num1 - num2 - num3 - num4;
    }
    double multiply() {
        return num1 * num2 * num3 * num4;
    }
    double divide() {
        if (num2 == 0 || num3 == 0 || num4 == 0) {
            cout << "Error: Division by zero!" << endl;
            return 0;  
        }
        return num1 / num2 / num3 / num4;
    }
    void displayValues() {
        cout << "num1: " << num1 << ", num2: " << num2 << ", num3: " << num3 << ", num4: " << num4 << endl;
    }
};
int main() {
    Calculator calc(10.5, 5.5, 2.0, 4.0);
    cout << "Calculator initialized with values:" << endl;
    calc.displayValues();
    cout << "\nAddition of all values: " << calc.add() << endl;
    cout << "Subtraction of all values: " << calc.subtract() << endl;
    cout << "Multiplication of all values: " << calc.multiply() << endl;
    cout << "Division of all values: " << calc.divide() << endl;
    return 0;
}

