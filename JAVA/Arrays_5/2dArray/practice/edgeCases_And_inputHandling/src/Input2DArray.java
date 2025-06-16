//Take input for a 2D array from the user (rows, columns, values), then print the array row-wise.

import java.util.Scanner;

public class Input2DArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read number of rows
        int row = scanner.nextInt();
        // Read number of columns
        int col = scanner.nextInt();

        // Create 2D array with given size
        int[][] arr = new int[row][col];

        // Take input for each element in 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " "); // Print element with space
            }
            System.out.println(); // New line after each row
        }
    }
}
