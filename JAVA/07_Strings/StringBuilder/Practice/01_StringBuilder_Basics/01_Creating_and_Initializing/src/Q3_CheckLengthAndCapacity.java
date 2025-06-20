// 3. Check the length and capacity of a `StringBuilder`

public class Q3_CheckLengthAndCapacity {
    public static void main(String[] args) {

        // Create a StringBuilder object with initial content "Hello World"
        StringBuilder stringBuilder = new StringBuilder("Hello World");

        // Print the current content of the StringBuilder
        System.out.println(stringBuilder); // Output: Hello World

        // Print the length of the StringBuilder (number of characters)
        System.out.println(stringBuilder.length()); // Output: 11

        // Print the capacity of the StringBuilder
        // Capacity = initial string length (11) + default extra space (16) = 27
        System.out.println(stringBuilder.capacity()); // Output: 27
    }
}
