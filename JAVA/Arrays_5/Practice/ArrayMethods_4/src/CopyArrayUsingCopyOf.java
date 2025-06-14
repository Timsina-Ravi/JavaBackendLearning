//Copy a 3-element array into a 5-length array using copyOf.
import java.util.Arrays;  // For copyOf() and toString()

public class CopyArrayUsingCopyOf {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};  // Original 3-element array

        int[] arr2 = Arrays.copyOf(arr, 5);  // Create a 5-length array, copy first 3 values

        arr2[3] = 100;  // Fill extra index with custom value
        arr2[4] = 200;

        System.out.println(Arrays.toString(arr2));
    }
}
