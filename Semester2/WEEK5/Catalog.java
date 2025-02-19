package week_5;

import java.util.ArrayList;
import java.util.List;

class Catalog {
    private List<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable Books in the Catalog:");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayDetails();
            }
        }
    }

    public Book findBookById(String bookID) {
        for (Book book : books) {
            if (book.getBookID().equalsIgnoreCase(bookID)) {
                return book;
            }
        }
        return null;
    }
}