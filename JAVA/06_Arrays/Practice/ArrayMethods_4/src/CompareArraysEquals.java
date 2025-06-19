//Compare two arrays using Arrays.equals().

import java.util.Arrays;

public class CompareArraysEquals {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};  // First array
        int[] b = {1, 2, 3};  // Second array

        // Check if both arrays are equal in length and content
        if (Arrays.equals(a, b)) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are not same");
        }
    }
}
