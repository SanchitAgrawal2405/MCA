#include <iostream>
#include <string>
using namespace std;
class BankAccount {
private:
    string depositorName;  
    string accountNumber; 
    string accountType;  
    double balance;       

public:
    BankAccount(string name, string accNo, string accType, double initialBalance) {
        depositorName = name;
        accountNumber = accNo;
        accountType = accType;
        balance = initialBalance;
    }
    void displayAccountDetails() {
        cout << "Account Holder: " << depositorName << endl;
        cout << "Account Number: " << accountNumber << endl;
        cout << "Account Type: " << accountType << endl;
        cout << "Current Balance: $" << balance << endl;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            cout << "$" << amount << " deposited successfully!" << endl;
            cout << "New Balance: $" << balance << endl;
        } else {
            cout << "Invalid deposit amount!" << endl;
        }
    }
    void withdraw(double amount) {
        if (amount <= 0) {
            cout << "Invalid withdrawal amount!" << endl;
        } else if (amount > balance) {
            cout << "Insufficient balance! Withdrawal failed." << endl;
        } else {
            balance -= amount;
            cout << "$" << amount << " withdrawn successfully!" << endl;
            cout << "New Balance: $" << balance << endl;
        }
    }
};

int main() {
    string name, accNo, accType;
    double initialBalance;
    cout << "Enter the name of the depositor: ";
    getline(cin, name);
    cout << "Enter the account number: ";
    getline(cin, accNo);
    cout << "Enter the type of account (e.g., Savings, Checking): ";
    getline(cin, accType);
    cout << "Enter the initial balance: $";
    cin >> initialBalance;
    BankAccount account(name, accNo, accType, initialBalance);
    cout << "\nAccount Details:" << endl;
    account.displayAccountDetails();
    double depositAmount;
    cout << "\nEnter amount to deposit: $";
    cin >> depositAmount;
    account.deposit(depositAmount);
    double withdrawAmount;
    cout << "\nEnter amount to withdraw: $";
    cin >> withdrawAmount;
    account.withdraw(withdrawAmount);

    return 0;
}

