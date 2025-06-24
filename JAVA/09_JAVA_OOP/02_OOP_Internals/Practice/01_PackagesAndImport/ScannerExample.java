

//Import java.util.Scanner and use it to take input.

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner object

        System.out.print("Enter your name: ");
        String name = input.nextLine(); // read a line from console

        System.out.println("Hello, " + name + "!");
        input.close(); // good practice to close Scanner
    }
}

