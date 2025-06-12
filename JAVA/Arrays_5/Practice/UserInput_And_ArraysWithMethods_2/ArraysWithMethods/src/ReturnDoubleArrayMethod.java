//Create a method that returns a double array with 3 values

public class ReturnDoubleArrayMethod {

    public static double[] getDoubleArray() {
        // Initializing and storing 3 double values
        double[] arr = {1.44, 2.45, 5.777};
        // Returning the array to the caller
        return arr;
    }

    // Method that accepts a double array and prints its elements
    public static void printMethod(double[] arr) {
        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Print the current element
            System.out.println(arr[i]);
        }
    }

    // Main method: the starting point of the program
    public static void main(String[] args) {
        // Call getDoubleArray() to get an array and pass it directly to printMethod to print it
        printMethod(getDoubleArray());
    }
}


