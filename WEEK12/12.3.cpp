#include <iostream>
#include <cmath> 
using namespace std;
class Triangle {
private:
    double base;  
    double height; 
public:
    Triangle(double b, double h) {
        base = b;
        height = h;
    }
    double hypo() {
        return sqrt(base * base + height * height);
    }
    double area() {
        return (base * height) / 2;
    }
};
int main() {
    double b, h;
    cout << "Enter the base of the triangle: ";
    cin >> b;
    cout << "Enter the height of the triangle: ";
    cin >> h;
    Triangle t(b, h);
    cout << "The length of the hypotenuse is: " << t.hypo() << endl;
    cout << "The area of the triangle is: " << t.area() << endl;
    return 0;
}

