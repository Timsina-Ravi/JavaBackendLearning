
//Handle and print appropriate messages for null or empty 2D arrays.

public class HandleNullEmpty2DArray {
    public static void print2DArray(int[][] arr) {
        if (arr == null) {
            System.out.println("Array is null");
            return;
        }
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        // Print elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = null;  // Change to test different arrays
        print2DArray(arr);
    }
}
