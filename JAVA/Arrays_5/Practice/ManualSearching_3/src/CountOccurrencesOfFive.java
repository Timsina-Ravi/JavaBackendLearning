// Count how many times 5 appears in the array.

public class CountOccurrencesOfFive {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 6, 8, 5, 78, 77, 5};
        int target = 5;         // The number to count
        int count = 0;          // Counter to track how many times 5 appears

        // Loop through the array to count occurrences of 5
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                count++;
            }
        }

        // Print the result based on how many times 5 was found
        if (count > 0) {
            System.out.println("5 appears " + count + " times in the array.");
        } else {
            System.out.println("5 doesn't appear in the array.");
        }
    }
}
