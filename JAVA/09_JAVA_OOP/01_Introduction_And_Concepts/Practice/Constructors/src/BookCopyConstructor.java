
/**
 * Demonstrates a copy constructor simulation.
 * Class: Book
 * Constructor: parameterized + copy constructor
 */
class Book {
    String title;
    String author;
    double price;

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
        System.out.println();
    }
}

public class BookCopyConstructor {
    public static void main(String[] args) {
        Book b1 = new Book("Effective Java", "Joshua Bloch", 45.50);
        Book b2 = new Book(b1);  // Copy of b1

        b1.displayInfo();
        b2.displayInfo();
    }
}
