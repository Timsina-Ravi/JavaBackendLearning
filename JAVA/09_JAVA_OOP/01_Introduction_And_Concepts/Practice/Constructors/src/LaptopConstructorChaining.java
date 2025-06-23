
/**
 * Demonstrates constructor chaining using this()
 * Class: Laptop
 */
class Laptop {
    String brand;
    int ram;
    double price;

    // Default constructor calls parameterized constructor
    Laptop() {
        this("HP", 8, 650.0);
    }

    // Parameterized constructor
    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM   : " + ram + " GB");
        System.out.println("Price : $" + price);
    }
}

public class LaptopConstructorChaining {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();  // Calls default constructor
        laptop.displayInfo();
    }
}
