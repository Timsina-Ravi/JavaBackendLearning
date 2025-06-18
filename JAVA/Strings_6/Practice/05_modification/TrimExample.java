//Trim whitespace from the start and end of a string using `.trim()`.
public class TrimExample {

    public static void main(String[] args) {

        // String with leading and trailing spaces
        String name = "    Ravi Timsina    ";

        // .trim() removes only spaces from the beginning and end — not in the middle
        System.out.println(name.trim());  // Output: "Ravi Timsina"
    }
}
