#include <iostream>
#include <string>
using namespace std;

struct DOB {
    int day;
    int month;
    int year;
};

struct Person {
    string name;
    DOB dob;  
};

int main() {
    Person person;

    cout << "Enter your name: ";
    getline(cin, person.name);
    
    cout << "Enter your date of birth (day month year): ";
    cin >> person.dob.day >> person.dob.month >> person.dob.year;

    cout << "\nName: " << person.name << endl;
    cout << "Date of Birth: " << person.dob.day << "/" << person.dob.month << "/" << person.dob.year << endl;

    return 0;
}
