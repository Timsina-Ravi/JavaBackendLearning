//Print the first and last characters of a string using `.charAt()`.

public class CharAtFirstLast {
    public static void main(String[] args) {

        // Declare and initialize the string variable
        String jhole = "Janata";

        // Print the first character of the string using charAt(0)
        System.out.println("First character: " + jhole.charAt(0));

        // Print the last character of the string using charAt(length - 1)
        System.out.println("Last character: " + jhole.charAt(jhole.length() - 1));
    }
}
