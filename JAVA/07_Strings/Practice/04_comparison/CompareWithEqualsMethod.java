//Compare two strings using `.equals()` and explain why it differs from `==`.

public class CompareWithEqualsMethod {
    public static void main(String[] args) {

        // Two string literals
        String name = "ravi";
        String name2 = "ravi";

        // .equals() compares actual string content (characters)
        System.out.println(name.equals(name2));  // Output: true

        // Two different String objects with same content
        String name3 = new String("ravi");
        String name4 = new String("ravi");

        // .equals() still returns true because contents are equal
        System.out.println(name3.equals(name4));  // Output: true
    }
}
