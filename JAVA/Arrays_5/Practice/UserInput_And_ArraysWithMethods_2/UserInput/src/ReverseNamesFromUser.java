//Take N names from the user and print them in reverse order.
import java.util.Scanner;

public class ReverseNamesFromUser {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter how many names they want to input
        System.out.println("Enter an array size: ");
        int n = scanner.nextInt(); // Read the number of names
        scanner.nextLine(); // Consume the leftover newline after nextInt()

        // Create a String array of size n to store the names
        String[] arr = new String[n];

        // Take 'n' names from the user and store them in the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Names: ");
            arr[i] = scanner.nextLine(); // Read and store each name
        }

        // Loop to print names in reverse order:
        // Start from the last index (arr.length - 1),
        // continue until the first index (0),
        // and decrease the index by 1 each time (go backwards)
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]); // Print the current name at index i
        }
    }
}
