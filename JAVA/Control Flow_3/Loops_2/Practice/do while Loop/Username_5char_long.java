//
//5. ii)  Ask the user to enter their username. Keep asking until they enter a username that is at least 5
//        characters long and contains no spaces. Once a valid username is entered, print a message
//
//        confirming the username is valid.

import java.util.Scanner;

public class Username_5char_long {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        do {
            System.out.println("Enter Your Name");
            name = sc.nextLine();
            if (name.length() != 5) {
                System.out.println("Invalid name! Name should have at least 5 characters");
            }

        } while (name.length() != 5);
        System.out.println("the username is valid");
    }
}

