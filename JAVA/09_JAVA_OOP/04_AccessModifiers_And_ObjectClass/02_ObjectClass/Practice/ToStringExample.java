// Demonstrates overriding toString() method

public class ToStringExample {
    String name = "Book";
    int price = 200;

    @Override
    public String toString() {
        return "Item: " + name + ", Price: " + price;
    }

    public static void main(String[] args) {
        ToStringExample item = new ToStringExample();
        System.out.println(item); // Calls item.toString()
    }
}

