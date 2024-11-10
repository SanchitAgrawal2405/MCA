#include <iostream> 
#include <string>   
using namespace std;
int main() {
    string name, branch;
    int year;
    cout << "Enter your name: ";
    getline(cin, name); 
    cout << "Enter your branch: ";
    getline(cin, branch); 
    cout << "Enter your year of study: ";
    cin >> year;
    cout << "\nName: " << name << endl;
    cout << "Branch: " << branch << endl;
    cout << "Year: " << year << endl;
    return 0; 
}

