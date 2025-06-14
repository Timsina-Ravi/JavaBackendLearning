//Clone an array and change the original. Check if clone changes.

import java.util.Arrays;

public class ArrayCloneCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  // Original array

        int[] arr2 = Arrays.copyOf(arr, 7);  // Clone with length 7 (extra elements will be 0)

        arr[2] = 6;  // Changing the 3rd element in the original array

        // Printing the cloned array
        // This proves that changing the original does NOT affect the copied array
        System.out.println(Arrays.toString(arr2));  // Output: [1, 2, 3, 4, 5, 0, 0]
    }
}
