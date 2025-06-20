// Delete characters from index 2 to 5.

public class Q1_DeleteRange {
    public static void main(String[] args) {

        // Initialize StringBuilder with "RaviTimsina"
        StringBuilder stringBuilder = new StringBuilder("RaviTimsina");

        // Delete characters from index 2 (inclusive) to 5 (exclusive)
        // Characters at indices 2, 3, and 4 ("viT") will be removed
        stringBuilder.delete(2, 5);

        // Print the resulting string
        System.out.println(stringBuilder);  // Output: Raimsina
    }
}
