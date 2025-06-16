//Print the sum of each row in a 2D array.

public class RowWiseSum {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // --- Row-wise sum using traditional for loops ---
        System.out.println("Row-wise sum (traditional for):");
        for (int i = 0; i < arr.length; i++) {   // Loop through each row
            int sum = 0;                         // Reset sum for each row
            for (int j = 0; j < arr[i].length; j++) {  // Loop through each element in the current row
                sum += arr[i][j];                // Add element to sum
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }

        // Using enhanced for-each loop to sum each row
        System.out.println("Row-wise sum (enhanced for-each) without row numbers:");
        for (int[] row : arr) {            // Loop through each row array directly
            int sum = 0;                   // Reset sum for the current row
            for (int num : row) {          // Loop through each element in the current row
                sum += num;                // Add the element to the sum
            }
            // Print the sum without specifying row number
            System.out.println("Sum = " + sum);
        }
    }
}
