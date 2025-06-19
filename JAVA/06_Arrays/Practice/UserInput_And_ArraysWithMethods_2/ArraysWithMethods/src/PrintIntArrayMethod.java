// Write a method printArray(int[] arr) to print elements.
public class PrintIntArrayMethod {

    // Method to print elements of an integer array
    public static void printArray(int[] array) {
        // Loop through the array using index
        for (int i = 0; i < array.length; i++) {
            // Print each element one by one
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        // Call the printArray method and pass an array as argument
        // This creates an array {1, 2, 4} and sends it to the method
        printArray(new int[]{1, 2, 4});
    }
}
