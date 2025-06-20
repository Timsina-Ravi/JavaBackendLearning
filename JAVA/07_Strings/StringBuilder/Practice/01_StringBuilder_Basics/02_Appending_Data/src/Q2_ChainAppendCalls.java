// 5. Chain multiple `append()` calls together in one statement.

public class Q2_ChainAppendCalls {
    public static void main(String[] args) {

        // Create an empty StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // Chain multiple append() calls
        // Appends "Ravi", then 1, then true in one statement
        stringBuilder.append("Ravi").append(1).append(true);

        // Print the resulting StringBuilder content
        System.out.println(stringBuilder);  // Output: Ravi1true
    }
}
