public class noReturn_withParameter_03 {

    // A function that takes one parameter and returns nothing
    public static void greetUser(String name) {
        // Print a personalized message using the parameter
        System.out.println("Hello, " + name + "! Welcome to Java.");
    }

    public static void main(String[] args) {
        // Calling the function with a name as argument
        greetUser("Amit");
    }
}
