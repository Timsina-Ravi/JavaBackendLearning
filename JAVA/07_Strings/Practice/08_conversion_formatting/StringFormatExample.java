//Format a string using String.format() to include variables.

public class StringFormatExample {
    public static void main(String[] args) {
        String lang = "Java";
        int version = 8;

        // Format the string with placeholders for variables
        String result = String.format("Language: %s, Version: %d", lang, version);

        System.out.println(result);  // Output: Language: Java, Version: 8
    }
}
