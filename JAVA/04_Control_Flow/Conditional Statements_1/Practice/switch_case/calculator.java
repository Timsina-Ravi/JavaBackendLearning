// Implement a simple calculator (addition, subtraction, multiplication, division).
import java.util.Scanner;
public class calcaulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println();

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter your choice between 1 to 4");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int add = a + b;
                System.out.println("The addition of " + a + " and " + b + " is " + add);
                break;
            case 2:
                int sub = a - b;
                System.out.println("The subtraction of "  + a + " and " + b + " is " + sub);
                break;
            case 3:
                int mul = a * b;
                System.out.println("The multiplication of "  + a + " and " + b + " is " + mul);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                } else {
                    int div = a / b;
                    System.out.println("The division of " + a + " and " + b + " is " + div);
                }
                break;
            default:
                System.out.println("Invalid Choice! choose number between 1 to 4 only");
        }
    }
}
