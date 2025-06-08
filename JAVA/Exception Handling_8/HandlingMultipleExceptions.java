//1. Handling Multiple Exceptions
//Write a program that accepts   two integers from the user and:
//        1. Calculates the sum of the numbers.
//        2. Calculates the average.
//
//Handle the following scenarios:
//        - `InputMismatchException` if the user enters non-integer values.
//        - `ArithmeticException` if the list is empty (division by zero).
//
//Use a `try-catch` block for each exception and prompt the user until valid data is provided.

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingMultipleExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
                System.out.println("Enter first number ");
                int num1 = scanner.nextInt();

                System.out.println("Enter second number ");
                int num2 = scanner.nextInt();

                int sum = num1 + num2;
                System.out.println("The sum of two numbers is " + sum);

                int average = sum / 2;
                System.out.println("The average of two numbers is " + average);
                
            }catch(InputMismatchException e){
            System.out.println("Error: Please enter integers only.");
            }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
            }
scanner.close();
    }
}