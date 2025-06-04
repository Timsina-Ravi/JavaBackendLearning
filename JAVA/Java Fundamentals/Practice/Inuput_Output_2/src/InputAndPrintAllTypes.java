// Take an input from the user and print it.


import java.util.Scanner;  // Scanner is used to take input from user

public class InputAndPrintAllTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // asks inputs from keyboard (user input)

        // ----------- Numeric Data Types -----------

        System.out.print("Enter an integer: ");
        int integer = sc.nextInt();  // takes integer input (example: 5)

        System.out.print("Enter a float: ");
        float decimal = sc.nextFloat();  // takes float input (example: 5.7)

        System.out.print("Enter a double: ");
        double doubleNum = sc.nextDouble();  // takes double input (example: 3.14159)

        System.out.print("Enter a long number: ");
        long longNum = sc.nextLong();  // takes long input (example: 12345678901)

        System.out.print("Enter a short number: ");
        short shortNum = sc.nextShort();  // takes short input (example: 1200)

        System.out.print("Enter a byte number: ");
        byte byteNum = sc.nextByte();  // takes byte input (example: 100)

        // ----------- Boolean -----------

        System.out.print("Enter true or false: ");
        boolean bool = sc.nextBoolean();  // takes boolean input (true / false)

        // ----------- String Inputs -----------

        sc.nextLine();  // clears the buffer (very important before using nextLine)

        System.out.print("Enter a single word: ");
        String word = sc.next();  // takes single word input (example: Hello)

        sc.nextLine();  // clears the leftover \n again

        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine();  // takes full line input (example: I love Java programming)

        // ----------- Character Input -----------

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);  // takes only first character of the input string (example: A)

        // ----------- Print All Inputs -----------

        System.out.println("\n---- OUTPUT ----");
        System.out.println("Integer: " + integer);
        System.out.println("Float: " + decimal);
        System.out.println("Double: " + doubleNum);
        System.out.println("Long: " + longNum);
        System.out.println("Short: " + shortNum);
        System.out.println("Byte: " + byteNum);
        System.out.println("Boolean: " + bool);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);
        System.out.println("Character: " + ch);
    }
}
