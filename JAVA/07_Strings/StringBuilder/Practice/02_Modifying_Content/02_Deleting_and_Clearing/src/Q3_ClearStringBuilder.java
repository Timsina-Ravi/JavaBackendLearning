// Clear a `StringBuilder` to reuse it again.

public class Q3_ClearStringBuilder {
    public static void main(String[] args) {

        // Create a StringBuilder with some initial content
        StringBuilder stringBuilder = new StringBuilder("Java");

        // Clear the content by setting the length to 0
        stringBuilder.setLength(0);

        // Print to verify it's empty
        System.out.println(stringBuilder); // Output: (empty line)

        // Now you can reuse it
        stringBuilder.append("Python");
        System.out.println(stringBuilder); // Output: Python
    }
}
