// Write a method to calculate and return the sum of all elements in a 2D array.

public class SumOf2DArray {

    // Method to calculate and print the sum of elements using a for loop
    public static void calculateSum() {
        // Declare and initialize a 2D array
        int[][] arr = {
                {2, 3, 4},
                {5, 6, 7}
        };

        // Initialize sum variable to store the total sum
        int sum = 0;

        // Use nested for loops to traverse each element of the 2D array
        for (int i = 0; i < arr.length; i++) {           // Loop through each row
            for (int j = 0; j < arr[i].length; j++) {    // Loop through each column in current row
                sum = sum + arr[i][j];                    // Add the current element to sum
            }
        }

        // Print the total sum of all elements
        System.out.println(sum);

        // Alternative way using for-each loop (commented out)
        /*
        for (int[] row : arr) {               // For each row in the array
            for (int element : row) {         // For each element in the row
                sum = sum + element;          // Add element to sum
            }
        }
        return sum;                          // Return the total sum
        */
    }

    // Main method to run the program
    public static void main(String[] args) {
        calculateSum();   // Call the method that calculates and prints the sum

        // To use the for-each version (which returns sum), you would uncomment and use:
        // int result = calculateSum();
        // System.out.print(result);
    }

}
