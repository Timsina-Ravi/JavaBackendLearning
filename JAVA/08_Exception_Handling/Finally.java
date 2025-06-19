
//
//3. Resource Management with `finally`
//Write a program that performs the following tasks:
//
//        - Accepts two integers from the user.
//        - Uses a `try-catch` block to handle `InputMismatchException` if the user enters non-integer values.
//        - Uses a `finally` block to print "Input processing complete" after the program finishes execution, regardless of whether an exception was thrown.
//
//This version focuses on resource management with `finally` without requiring file handling.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number");
            int num1 = scanner.nextInt();

            System.out.println("Enter second number");
            int num2 = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Enter integer value only");
        }finally {
            System.out.println("Input processing complete");
        }
    }
}
