// Delete a single character at a specific index.

public class Q2_DeleteAtIndex {
    public static void main(String[] args) {

        // Initialize StringBuilder with "Ravii"
        StringBuilder stringBuilder = new StringBuilder("Ravii");

        // Delete the character at index 4 (the last 'i' in "Ravii")
        stringBuilder.deleteCharAt(4);

        // Print the resulting string after deletion
        System.out.println(stringBuilder);  // Output: Ravi
    }
}
