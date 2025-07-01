// Demonstrates public access modifier

public class PublicModifierExample {
    public String name = "Ravi"; // Accessible from anywhere

    public void display() {
        System.out.println("Public Name: " + name);
    }

    public static void main(String[] args) {
        PublicModifierExample obj = new PublicModifierExample();
        obj.display(); // OK
    }
}

