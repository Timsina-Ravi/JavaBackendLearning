//Print the sum of each column in a 2D array.

public class ColumnWiseSum {
    public static void main(String[] args) {
        // Define a 2D array with varying row lengths (jagged array)
        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9, 10}
        };

        // Step 1: Find the maximum number of columns among all rows
        int maxCols = 0;
        for (int[] row : arr) {
            if (row.length > maxCols) {
                maxCols = row.length;
            }
        }

        // Step 2: Calculate and print the sum of each column
        for (int col = 0; col < maxCols; col++) {
            int sum = 0;
            for (int[] row : arr) {
                if (col < row.length) {  // Check if the current row has this column
                    sum += row[col];
                }
            }
            System.out.println("Sum of column " + (col + 1) + " = " + sum);
        }
    }
}
