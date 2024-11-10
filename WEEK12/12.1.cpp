#include <iostream>
using namespace std;
class MyClass {
private:
    int num1;  
    double num2; 
public:
    MyClass() {
        num1 = 10;
        num2 = 20.5;  
    }
    void displayValues() {
        cout << "Value of num1: " << num1 << endl;
        cout << "Value of num2: " << num2 << endl;
    }
};
int main() {
    MyClass obj;
    obj.displayValues();
    return 0;
}

