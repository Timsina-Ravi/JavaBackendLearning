
/**
 * Demonstrates the use of 'this' keyword.
 * Class: Product
 */
class Product {
    String name;
    int id;
    double price;

    // Constructor where parameter names match instance variables
    Product(String name, int id, double price) {
        this.name = name;   // 'this' refers to instance variable
        this.id = id;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Product ID  : " + id);
        System.out.println("Price       : $" + price);
    }
}

public class ProductThisKeyword {
    public static void main(String[] args) {
        Product p = new Product("Mouse", 101, 25.75);
        p.displayInfo();
    }
}
