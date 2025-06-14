//Fill a string array with "Hello" and print it.


import java.util.Arrays;  // Import utility class for array operations

public class ArrayFillWithHello {
    public static void main(String[] args) {

        // Create a String array of size 5
        String[] names = new String[5];

        // Fill all elements of the array with the word "Hello"
        Arrays.fill(names, "Hello");

        // Print the contents of the array in readable format
        System.out.println(Arrays.toString(names));
    }
}
