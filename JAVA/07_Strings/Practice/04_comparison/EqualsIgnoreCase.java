//Compare strings ignoring case using `.equalsIgnoreCase()`.

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        // Declare two strings with same letters but different cases
        String cast = "Timsina";
        String cast2 = "timsina";

        // equalsIgnoreCase() compares values ignoring case differences
        System.out.println(cast.equalsIgnoreCase(cast2));  // Output: true
    }
}
