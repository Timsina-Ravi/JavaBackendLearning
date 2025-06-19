//Join an array of strings into a single string using String.join().



public class JoinStringsExample {
    public static void main(String[] args) {

        String[] words = {"Ram", "Shyam", "Hari"};

        // Join the array into a single string with spaces
        String joined = String.join(" ", words);

        System.out.println(joined);  // Output: Ram Shyam Hari
    }
}
