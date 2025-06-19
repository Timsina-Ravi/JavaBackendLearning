//5.Ask the user to enter numbers and keep doing so until the user enters 0.


import java.util.Scanner;

public class Enter_0_stop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a Number");
            num = scanner.nextInt();
            if (num != 0) {
                System.out.println("You Entered: " + num);
            }
        } while (num != 0);
        System.out.println("You Entered 0, The End ");
    }
}

