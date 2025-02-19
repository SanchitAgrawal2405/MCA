package week_5;

class Book {
    private String bookID;
    private String title;
    private String author;
    private String genre;
    //private String number;
    private boolean isAvailable;

    public Book(String bookID, String title, String author, String genre ) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        //this.number = number;
        this.isAvailable = true;
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void displayDetails() {
        System.out.println("ID: " + bookID + ", Title: " + title + ", Author: " + author +
                ", Genre: " + genre + ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}

class FictionBook extends Book {
    private String subGenre;

    public FictionBook(String bookID, String title, String author, String subGenre ) {
        super(bookID, title, author, "Fiction");
        this.subGenre = subGenre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Sub-Genre: " + subGenre);
    }
}

class NonFictionBook extends Book {
    private String field;

    public NonFictionBook(String bookID, String title, String author, String field) {
        super(bookID, title, author, "Non-Fiction");
        this.field = field;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Field: " + field);
    }
}