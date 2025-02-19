package week_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalog catalog = new Catalog();

        // Adding books to catalog
        catalog.addBook(new FictionBook("S101", "To Kill a Mockingbird ", "Haper Lee", "Fictious"));
        catalog.addBook(new FictionBook("S102", "1984", "George Orwell", "Adventure"));
        catalog.addBook(new NonFictionBook("NS201", "Pride and Prejudice", "Jane Austen", "History"));
        catalog.addBook(new NonFictionBook("NS202", "The Hunger Games", "Suzanne Collins", "Memoir"));

        System.out.println("\n\tWelcome to the Online Library System!");
        System.out.print("Enter your User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter your Name: ");
        String userName = scanner.nextLine();

        User user = new User(userId, userName);

        int choice;
        do {
            System.out.println("\n\t\tMenu:");
            System.out.println("1. Display Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Show Borrowed Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    catalog.displayAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to Borrow: ");
                    String borrowId = scanner.nextLine();
                    Book borrowBook = catalog.findBookById(borrowId);
                    if (borrowBook != null) {
                        user.borrowBook(borrowBook);
                    } else {
                        System.out.println("Invalid Book ID.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ID to Return: ");
                    String returnId = scanner.nextLine();
                    Book returnBook = catalog.findBookById(returnId);
                    if (returnBook != null) {
                        user.returnBook(returnBook);
                    } else {
                        System.out.println("Invalid Book ID.");
                    }
                    break;
                case 4:
                    user.showBorrowedBooks();
                    break;
                case 5:
                    System.out.println("\n\n\t\tThank you for using the Library System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}