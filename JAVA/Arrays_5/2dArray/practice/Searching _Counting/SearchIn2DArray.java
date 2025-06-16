//Check whether a specific number exists in a 2D array (return true/false).
public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {23, 34, 55},
                {2, 5, 6}
        };
        int target = 2;
        boolean isFound = false;
/*
        //With for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("The number exists at row " + i + ", column " + j);
                    isFound = true;
                    break; // break inner loop
                }
            }
            if (isFound) {
                break; // break outer loop
            }
        }

        if (!isFound) {
            System.out.println("The number doesn't exist in the array.");
        }
*/
        // With For-Each

        // Loop through each row in the 2D array
        for (int[] row : arr) {
            // Loop through each element in the current row
            for (int element : row) {
                if (element == target) {
                    System.out.println("The number exists in the array.");
                    isFound = true;
                    break; // Break inner loop
                }
            }
            if (isFound) {
                break; // Break outer loop
            }
        }

        if (!isFound) {
            System.out.println("The number doesn't exist in the array.");
        }
    }
}



