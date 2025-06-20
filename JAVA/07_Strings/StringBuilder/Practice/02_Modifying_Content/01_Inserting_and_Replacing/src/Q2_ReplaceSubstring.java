// 7. Replace a portion of the string with another string.

public class Q2_ReplaceSubstring {
    public static void main(String[] args) {

        // Initialize StringBuilder with "Ravi Timsina"
        StringBuilder stringBuilder = new StringBuilder("Ravi Timsina");

        // Replace characters from index 0 (inclusive) to 4 (exclusive) with "Ashish"
        // This replaces "Ravi" with "Ashish"
        stringBuilder.replace(0, 4, "Ashish");

        // Print the modified string
        System.out.println(stringBuilder);  // Output: Ashish Timsina
    }
}
