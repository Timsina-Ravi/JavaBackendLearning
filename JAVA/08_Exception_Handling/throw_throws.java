//
//5. Combining `throw` and `throws`
//Create a method `calculateSquareRoot(double number)` that:
//        1. Throws an `IllegalArgumentException` if the input number is negative.
//       2. Calculates and returns the square root for valid input.
//
//Call this method from the main program, handle the exception, and display "Input must
//be non-negative" when caught.
//
//
//These questions mix concepts to ensure you learn to handle multiple exceptions effectively,
//create custom exceptions, and use `try-catch` with `finally`.
//
//


import java.util.Scanner;

class myException extends Exception {


    public double calculateSquareRoot(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException();
        } else {
            return Math.sqrt(number);


        }
    }
}
    public class throw_throws {
        public static void main(String[] args) {

            myException illegalAgrumentException = new myException();
            try {
               double result =  illegalAgrumentException.calculateSquareRoot(-20.0);
                System.out.println("The square of a number is " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Input must be non-negative");


            }

        }


    }