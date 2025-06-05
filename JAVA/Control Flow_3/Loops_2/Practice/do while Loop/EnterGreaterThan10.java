//6.Keep prompting the user for a number until they enter a number greater than 10.


import java.util.Scanner;

public class EnterGreaterThan10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a number");
            num = sc.nextInt();
            if (num < 10) {
                System.out.println("Invalid Number!, Enter a number greater than 10");
            }
        } while (num < 10);
        System.out.println("You Entered a valid Number that is " + num);
    }
}

