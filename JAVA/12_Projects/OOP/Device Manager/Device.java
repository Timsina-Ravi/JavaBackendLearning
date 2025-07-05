Device.javapublic class Device extends Item {   // Inheritance (extends Item)
    private String model;            // Encapsulation (private field)

    public Device(String name, double price, String model) {
        super(name, price);
        this.model = model;
    }

    public void setName(String name) { this.name = name; }     // Encapsulation (setter)
    public void setPrice(double price) { this.price = price; } // Encapsulation (setter)
    public void setModel(String model) { this.model = model; } // Encapsulation (setter)

    @Override
    public void display() {         // Polymorphism (overriding abstract method)
        System.out.println("Name: " + name + ", Price: " + price + ", Model: " + model);
    }
}

