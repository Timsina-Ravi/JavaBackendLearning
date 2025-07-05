import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("Welcome to Basic Calculator!");

        while (keepRunning) {
            System.out.println("Please select an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = input.nextInt();


            System.out.print("Enter first number: ");
            double firstNumber = input.nextDouble();

            System.out.print("Enter second number: ");
            double secondNumber = input.nextDouble();

            double result;

            switch (choice) {
                case 1:
                    result = firstNumber + secondNumber;
                    System.out.println("Sum is: " + result);
                    break;

                case 2:
                    result = firstNumber - secondNumber;
                    System.out.println("Difference is: " + result);
                    break;

                case 3:
                    result = firstNumber * secondNumber;
                    System.out.println("Product is: " + result);
                    break;

                case 4:
                    result = firstNumber / secondNumber;
                    System.out.println("Quotient is: " + result);
                    break;

                case 5:
                    System.out.println("Thank you for using the calculator");
                    keepRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice, Please try again.");
                    break;
            }
        }

        input.close();
    }
}

