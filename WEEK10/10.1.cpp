#include <iostream>
using namespace std;

struct Complex {
    double real;
    double imag;
};

Complex readComplex() {
    Complex c;
    cout << "Enter real part: ";
    cin >> c.real;
    cout << "Enter imaginary part: ";
    cin >> c.imag;
    return c;
}

void writeComplex(Complex c) {
    cout << c.real << " + " << c.imag << "i" << endl;
}

Complex addComplex(Complex c1, Complex c2) {
    Complex result;
    result.real = c1.real + c2.real;
    result.imag = c1.imag + c2.imag;
    return result;
}

Complex subtractComplex(Complex c1, Complex c2) {
    Complex result;
    result.real = c1.real - c2.real;
    result.imag = c1.imag - c2.imag;
    return result;
}

Complex multiplyComplex(Complex c1, Complex c2) {
    Complex result;
    result.real = c1.real * c2.real - c1.imag * c2.imag;
    result.imag = c1.real * c2.imag + c1.imag * c2.real;
    return result;
}

int main() {
    cout << "Reading first complex number:" << endl;
    Complex c1 = readComplex();
    
    cout << "Reading second complex number:" << endl;
    Complex c2 = readComplex();
    
    cout << "\nFirst complex number: ";
    writeComplex(c1);
    
    cout << "Second complex number: ";
    writeComplex(c2);
    
    Complex sum = addComplex(c1, c2);
    cout << "\nAddition of the two complex numbers: ";
    writeComplex(sum);

    Complex difference = subtractComplex(c1, c2);
    cout << "Subtraction of the two complex numbers: ";
    writeComplex(difference);
    
    Complex product = multiplyComplex(c1, c2);
    cout << "Multiplication of the two complex numbers: ";
    writeComplex(product);

    return 0;
}
