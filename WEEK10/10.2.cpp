#include <iostream>
#include <string>
using namespace std;

struct Employee {
    string name;
    double basicPay;
    double grossSalary;
};

double calculateGrossSalary(double basicPay) {
    double DA = 0.52 * basicPay; 
    return basicPay + DA;
}

int main() {
    int numEmployees = 100;
    Employee employees[numEmployees];

    for (int i = 0; i < numEmployees; ++i) {
        cout << "Enter name of employee " << (i + 1) << ": ";
        cin >> employees[i].name;
        cout << "Enter basic pay of " << employees[i].name << ": ";
        cin >> employees[i].basicPay;
        
        // Calculate gross salary
        employees[i].grossSalary = calculateGrossSalary(employees[i].basicPay);
    }

    cout << "\nEmployee Details (Name and Gross Salary):\n";
    for (int i = 0; i < numEmployees; ++i) {
        cout << "Name: " << employees[i].name
             << ", Gross Salary: " << employees[i].grossSalary << endl;
    }

    return 0;
}
