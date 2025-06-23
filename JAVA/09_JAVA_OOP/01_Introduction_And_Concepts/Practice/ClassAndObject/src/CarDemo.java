
/**
 * Demonstrates a basic class and object usage in Java.
 * Class: Car
 * Properties: brand, model, price
 * Method: displayDetails()
 */
class Car {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Creating and initializing car objects
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.price = 25000;

        Car car2 = new Car();
        car2.brand = "Tesla";
        car2.model = "Model 3";
        car2.price = 39999;

        // Display details
        car1.displayDetails();
        car2.displayDetails();
    }
}
