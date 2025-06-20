// 4. Append a string, integer, and boolean to a `StringBuilder`.

public class Q1_AppendDifferentTypes {
    public static void main(String[] args) {

        // Create an empty StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // Append a string
        stringBuilder.append("Ravi");       // Now contains: "Ravi"

        // Append an integer
        stringBuilder.append(1);            // Now contains: "Ravi1"

        // Append a boolean
        stringBuilder.append(false);        // Now contains: "Ravi1false"

        // Print the final content of the StringBuilder
        System.out.println(stringBuilder);  // Output: Ravi1false
    }
}
