public class recursiveFunction_06 {

    // Recursive function to calculate factorial
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1)
            return 1;
        else
            // Recursive call
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num); // calling factorial of 5
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
