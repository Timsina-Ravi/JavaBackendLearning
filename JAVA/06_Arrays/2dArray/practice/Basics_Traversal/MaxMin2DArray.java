// Write a method to find and print the maximum and minimum element in a 2D array.

public class MaxMin2DArray {

    // Method to find and print max and min in a 2D array
    public static void findMaxMin() {

        // Declare and initialize the 2D array
        int[][] array = {
                {23, 45, 76},
                {54, 97, 43}
        };

        // Initialize max and min with the first element of the array
        int max = 23;
        int min = 23;

        // Loop through each row
        for (int i = 0; i < array.length; i++) {
            // Loop through each element in the current row
            for (int j = 0; j < array[i].length; j++) {

                // If the current element is greater than max, update max
                if (array[i][j] >= max) {
                    max = array[i][j];
                }

                // If the current element is less than min, update min
                else if (array[i][j] <= min) {
                    min = array[i][j];
                }
            }
        }

        // Print the maximum and minimum values
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    // Main method to run the program
    public static void main(String[] args) {
        findMaxMin();  // Call the method
    }
}
