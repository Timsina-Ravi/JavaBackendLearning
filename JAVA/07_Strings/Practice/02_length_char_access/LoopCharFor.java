//Loop through all characters in a string using a `for` loop and print them one by one.

public class LoopCharFor {
    public static void main(String[] args) {
        String name = "Ravi Timsina";

        // Loop through the string from index 0 to length-1
        for (int i = 0; i < name.length(); i++) {
            // Print the character at index i
            System.out.println(name.charAt(i));
        }
    }
}
