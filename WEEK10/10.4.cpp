#include <iostream>
#include <string>
using namespace std;

union Address {
    char name[50];
    char home_address[100];
    char hostel_address[100];
    char city[50];
    char state[50];
    char zip[10];
};

int main() {
    Address addr;

    cout << "Enter your name: ";
    cin.getline(addr.name, 50);
    cout << "Enter your home address: ";
    cin.getline(addr.home_address, 100);  
    cout << "Enter your hostel address: ";
    cin.getline(addr.hostel_address, 100);   
    cout << "Enter city: ";
    cin.getline(addr.city, 50);              
    cout << "Enter state: ";
    cin.getline(addr.state, 50);             
    cout << "Enter zip code: ";
    cin.getline(addr.zip, 10);               
    
    cout << "\nPresent Address:\n";
    cout << "Zip Code: " << addr.zip << endl;  
    
    

    return 0;
}
