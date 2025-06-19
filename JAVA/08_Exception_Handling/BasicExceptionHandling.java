
//
//Question 1: Basic Exception Handling
//"Write a Java program that takes two integers as input and performs division. Use `try-catch`
//to handle `ArithmeticException` (e.g., division by zero) and ensure that a message is printed in
//the `finally` block, regardless of whether an exception occurs. Test the program with both valid
//and invalid inputs."


import java.util.Scanner;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1= sc.nextInt();

        System.out.println("Enter second Number");
        int num2 = sc.nextInt();

    int c = num1/num2;
    System.out.println("The result of division of two numbers is " + c);

}catch (ArithmeticException e){
    System.out.println(" Division by zero is not allowed.");
}finally {
    System.out.println(" regardless of whether an exception occurs");

}

    }
}
