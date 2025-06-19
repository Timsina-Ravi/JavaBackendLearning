
//Declare a 2D array and print its elements:  Row-wise ,Column-wise

    public  class Print2DArray {
        public static void main(String[] args) {
    
            // Declare and initialize a 2D array with 2 rows and 3 columns
            int[][] arr = {
                    {1, 2, 3},
                    {4, 5, 6}
            };
    
            // ----------- Row-wise printing -----------
            // Outer loop iterates over each row
            for (int i = 0; i < arr.length; i++) {
                // Inner loop iterates over each column in the current row
                for (int j = 0; j < arr[0].length; j++) {
                    // Print the element at row i and column j without newline
                    System.out.print(arr[i][j]);
                }
                // After printing all columns of a row, print a newline to move to the next row
                System.out.println();
            }
    
            // ----------- Column-wise printing -----------
            // Outer loop iterates over each column
            for (int j = 0; j < arr[0].length; j++) {
                // Inner loop iterates over each row for the current column
                for (int i = 0; i < arr.length; i++) {
                    // Print the element at row i and column j without newline
                    System.out.print(arr[i][j]);
                }
                // After printing all rows of a column, print a newline to move to the next column
                System.out.println();
            }
        }
    }
