//
//
//4. Nested Try-Catch for Complex Operations
//Write a program that:
//        1. Accepts two numbers from the user and performs division.
//2. Handles `ArithmeticException` for division by zero in the inner `try` block.
//3. Handles `InputMismatchException` for invalid inputs in the outer `try` block.
//
//Ensure the program gives clear feedback and continues prompting the user for valid inputs.
//


import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry_Catch {
    public static void main(String[] args) {

        boolean validInput = false;
        while (!validInput) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter first number");
                int num1 = scanner.nextInt();

                System.out.println("Enter second number");
                int num2 = scanner.nextInt();


                try {
                    int div = num1 / num2;
                    System.out.println("Division of num1 and num2 is " + div);
                    validInput = true;  // Exit the loop if no exception occurs

                } catch (ArithmeticException e) {
                    System.out.println("Not divisible by zero");
                }


            } catch (InputMismatchException e) {
                System.out.println("Enter integer value only");
            }

        }
    }
}