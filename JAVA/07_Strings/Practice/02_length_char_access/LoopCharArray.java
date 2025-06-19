//Loop through all characters using `toCharArray()` and enhanced for loop.

public class LoopCharArray {
    public static void main(String[] args) {
        // Declare and initialize the string variable
        String cast = "Timsina";

        // Convert the string into a char array using toCharArray()
        // Loop through each character in the array using enhanced for loop
        for (char ch : cast.toCharArray()) {
            // Print the current character
            System.out.println(ch);
        }
    }
}
