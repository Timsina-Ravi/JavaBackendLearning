
//
//2. Validating Input with Custom Exceptions
//Write a program that:
//        1. Accepts a user's age as input.
//        2. Throws a custom exception `InvalidAgeException` if the age is less than 18.
//
//Handle this exception in the main method, displaying "Age must be 18 or older!" when caught.


import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception{
        }


public class CustomExceptions {
    public static void main (String[] args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        try{
            if(age<18){
                throw new InvalidAgeException();
            }
            System.out.println("You can vote");
        }catch (InvalidAgeException e){
            System.out.println("Age must be 18 or older!");

        }
        scanner.close();
    }
}
