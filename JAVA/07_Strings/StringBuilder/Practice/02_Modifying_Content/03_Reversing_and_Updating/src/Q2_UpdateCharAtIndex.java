// 12. Change the character at a specific index.

public class Q2_UpdateCharAtIndex {
    public static void main(String[] args) {

        // Create a StringBuilder with initial content "Ravi"
        StringBuilder stringBuilder = new StringBuilder("Ravi");

        // Change the character at index 0 from 'R' to 'r'
        stringBuilder.setCharAt(0, 'r');

        // Print the updated content
        System.out.println(stringBuilder);  // Output: ravi
    }
}
