public abstract class Item {
    protected String name;   // Encapsulation (protected fields)
    protected double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void display();  // Abstraction (abstract method)
}

