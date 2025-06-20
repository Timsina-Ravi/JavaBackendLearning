// 6. Insert a string at the beginning, middle, and end of a `StringBuilder`.

public class Q1_InsertAtPositions {
    public static void main(String[] args) {

        // Initialize StringBuilder with "av"
        StringBuilder stringBuilder = new StringBuilder("av");

        // Insert "R" at the beginning (index 0)
        stringBuilder.insert(0, "R");  // Result: "Rav"

        // Insert "." at index 1 (middle position)
        stringBuilder.insert(1, ".");  // Result: "R.av"

        // Insert "i" at index 3 (near the end)
        stringBuilder.insert(3, "i");  // Result: "R.avi"

        // Print the final content
        System.out.println(stringBuilder);  // Output: R.avi

    }
}
