//Count how many times a specific number appears in a 2D array.

public class CountOccurrences2DArray {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},
                {3,4,3}};
        int target = 3;
        int count =0;

        // with for - each
        for (int[] row : arr) {
            for (int element : row) {
                if (element == target) {
                    count++;

                }

            }
        }

            /*with for loop
             Loop through each row (i) and each column (j)
            for (int i = 0; i < arr.length; i++) { // row-wise
                for (int j = 0; j < arr[i].length; j++) { // column-wise
                    if (arr[i][j] == target) {
                        count++; // ✅ Increase count if match found

                    }

             */
                    if (count > 0) {
                        System.out.print("Target appears " + count + " times in a 2D Array");
                    }else {
                        System.out.print("Target doesn't appeared in a 2D Array");
                    }


            }
        }
