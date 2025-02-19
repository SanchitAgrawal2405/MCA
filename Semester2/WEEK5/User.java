package week_5;

import java.util.ArrayList;
import java.util.List;

class User {
    private String userID;
    private String name;
    private List<Book> borrowedBooks;

    public User(String userID, String name) {
        this.userID = userID;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println("Book not found in borrowed list.");
        }
    }

    public void showBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                book.displayDetails();
            }
        }
    }
}
