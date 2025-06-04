//  1. Declare one variable of each primitive data type and print them

public class DataTypesAndTypeCasting {
    public static void main(String[] args) {

        byte myByte = 100;               // byte = 1 byte (range: -128 to 127)
        short myShort = 30000;           // short = 2 bytes
        int myInt = 123456789;           // int = 4 bytes
        long myLong = 9876543210L;       // long = 8 bytes (note the 'L' at end)
        float myFloat = 3.14f;           // float = 4 bytes (note the 'f' at end)
        double myDouble = 99.9999;       // double = 8 bytes
        char myChar = 'A';               // char = 2 bytes (Unicode character)
        boolean myBoolean = true;        // boolean = true or false

        System.out.println("----- All Primitive Data Types -----");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);


        // 2. Implicit Type Conversion
        // When smaller type is converted to larger type automatically
        int num1 = 50;
        double num2 = 25.5;
        double result = num1 + num2;  // int + double => result is double (implicit conversion)

        System.out.println("\n----- Implicit Type Conversion -----");
        System.out.println("int value: " + num1);
        System.out.println("double value: " + num2);
        System.out.println("Result (int + double): " + result);


        // 3. Explicit Type Casting
        // When you manually convert a larger type to smaller type
        double originalDouble = 45.78;
        int convertedInt = (int) originalDouble;  // double to int, fractional part will be lost

        System.out.println("\n----- Explicit Type Casting -----");
        System.out.println("Original double: " + originalDouble);
        System.out.println("Converted to int: " + convertedInt);
    }
}
