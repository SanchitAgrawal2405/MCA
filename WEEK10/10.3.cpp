#include <iostream>
#include <string>
using namespace std;

struct Book {
    int book_id;
    string title;
    string author;
    double price;
};

void printBookDetails(Book b) {
    cout << "Book ID: " << b.book_id << endl;
    cout << "Title: " << b.title << endl;
    cout << "Author: " << b.author << endl;
    cout << "Price: $" << b.price << endl;
}

int main() {
    Book myBook;
    cout << "Enter Book ID: ";
    cin >> myBook.book_id;
    cin.ignore();
    cout << "Enter Title: ";
    getline(cin, myBook.title);
    
    cout << "Enter Author Name: ";
    getline(cin, myBook.author);
    
    cout << "Enter Price: ";
    cin >> myBook.price;

    cout << "\nBook Details:\n";
    printBookDetails(myBook);

    return 0;
}
