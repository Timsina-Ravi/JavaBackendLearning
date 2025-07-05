import java.util.HashSet;

public class HashsetOperations {
    public static void main(String[] args) {

        // Create a HashSet to store email addresses
        HashSet<String> emails = new HashSet<>();

        // Add email addresses
        emails.add("ravi@gmail.com");
        emails.add("ravi@gmail.com");  // duplicate - will not be added
        emails.add("ravit@gmail.com");
        emails.add("raviti@gmail.com");
        emails.add("ravitim@gmail.com");
        emails.add("ravitims@gmail.com");

        // Print all emails in the set
        System.out.println("Emails in set: " + emails);

        // Loop through the set
        for (String email : emails) {
            System.out.println("Email: " + email);
        }

        // Check if a specific email exists
        System.out.println("Contains 'ravi@gmail.com'? " + emails.contains("ravi@gmail.com"));

        // Remove an email
        emails.remove("ravitim@gmail.com");
        System.out.println("After removing 'ravitim@gmail.com': " + emails);

        // ----------- Second Example -----------

        // Create another HashSet to store task names
        HashSet<String> tasks = new HashSet<>();
        tasks.add("task1");
        tasks.add("task2");
        tasks.add("task3");
        tasks.add("task4");

        System.out.println("\nTasks in set: " + tasks);

        // Try to add a duplicate task
        boolean added = tasks.add("task1");
        System.out.println("Was 'task1' added again? " + added);  // false
    }
}
