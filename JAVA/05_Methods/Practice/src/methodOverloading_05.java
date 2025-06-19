public class methodOverloading_05 {

    // First version: takes one parameter
    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Second version: takes two parameters (overloaded)
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Calling both versions of the method
        displayInfo("Amit");
        displayInfo("Amit", 20);
    }
}
