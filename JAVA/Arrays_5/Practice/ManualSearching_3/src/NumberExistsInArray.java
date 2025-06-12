//Check if a given number exists in the array or not.

import java.util.Scanner;

public class NumberExistsInArray {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number they want to search for
        System.out.println("Enter a Number To check: ");
        int number = scanner.nextInt();  // Read the number

        // Boolean flag to track if the number exists in the array
        boolean isexist = false;

        // Sample array to search the number in
        int[] arr = {1, 2, 3, 4};

        // Loop through the array to check if the number exists
        for (int i = 0; i < arr.length; i++) {
            // If the current element matches the number
            if (number == arr[i]) {
                // Print the index where the number is found
                System.out.println("Number " + number + " exists at index: " + i);
                isexist = true;  // Set flag to true
                break;  // Exit the loop as we found the number
            }
        }

        // If the flag is still false after the loop, number was not found
        if (!isexist) {
            System.out.println("Number doesn't exist in the array");
        }
    }
}
