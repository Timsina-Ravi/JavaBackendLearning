//Extract a substring from a given string using .substring().
public class SubstringExample {
    public static void main(String[] args) {

        String lang = "Java Programming";

        // Prints substring starting from index 5 to the end
        System.out.println(lang.substring(5));  // Output: "Programming"

        // Prints substring from index 0 to 3 (4 is exclusive)
        System.out.println(lang.substring(0, 4));  // Output: "Java"
    }
}

