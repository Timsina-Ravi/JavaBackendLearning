//5.i. Ask the user to enter a Number Keep asking until the user enters a number between 18 and 100
//        (inclusive), and then print a message confirming that the Number is valid.


import java.util.Scanner;

public class AskNumbers_18_100 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a Number Between 18 to 100 ");
            num = sc.nextInt();

        } while (num < 18 || num > 100);
        System.out.println("Number is valid");
    }
}

