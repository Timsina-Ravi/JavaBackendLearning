public class ReplaceIn2DArray{

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {3, 4, 3}
        };

        int target = 3;       // Number to replace
        int replacement = 9;  // Number to replace with

        // Loop through each row
        for (int i = 0; i < arr.length; i++) {
            // Loop through each element in the row
            for (int j = 0; j < arr[i].length; j++) {
                // If current element matches target, replace it
                if (arr[i][j] == target) {
                    arr[i][j] = replacement;
                }
            }
        }

        // Print the updated 2D array
        System.out.println("Array after replacements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
