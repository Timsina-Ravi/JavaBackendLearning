//Print an empty string and explain what happens.


public class EmptyStringExample {
    public static void main(String[] args) {

        String str1 = "";         // Empty string — length 0, no characters
        String str2 = new String(" "); // String with one space character

        System.out.println("str1: '" + str1 + "'"); // prints empty quotes to show emptiness
        System.out.println("str2: '" + str2 + "'"); // prints space inside quotes
    }
}
