//4. Operators
//Write a program to demonstrate all arithmetic operators (+, -, *, /, %) using two integer variables and print the results.
//
//Write a program to compare two numbers using relational operators (==, !=, >, <, >=, <=) and print the boolean results.
//
//Write a program to demonstrate the use of logical operators (&&, ||, !) with two boolean variables.
//
//Write a program to show the effect of different assignment operators (=, +=, -=, *=, /=, %=) on an integer variable.
//
//Write a program to explain increment (++) and decrement (--) operators, showing both pre- and post-increment/decrement.
//

public class AllOperatorsExample {
    public static void main(String[] args) {

        // Arithmetic Operators: +, -, *, /, %
        int a = 10;
        int b = 3;

        System.out.println("----- Arithmetic Operators -----");
        System.out.println("a + b = " + (a + b));   // adds a and b
        System.out.println("a - b = " + (a - b));   // subtracts b from a
        System.out.println("a * b = " + (a * b));   // multiplies a and b
        System.out.println("a / b = " + (a / b));   // divides a by b (integer division)
        System.out.println("a % b = " + (a % b));   // remainder when a divided by b

        // Relational Operators: ==, !=, >, <, >=, <=
        System.out.println("\n----- Relational Operators -----");
        System.out.println("a == b: " + (a == b));   // checks if a equals b (false)
        System.out.println("a != b: " + (a != b));   // checks if a is not equal to b (true)
        System.out.println("a > b: " + (a > b));     // checks if a is greater than b (true)
        System.out.println("a < b: " + (a < b));     // checks if a is less than b (false)
        System.out.println("a >= b: " + (a >= b));   // checks if a is greater or equal to b (true)
        System.out.println("a <= b: " + (a <= b));   // checks if a is less or equal to b (false)

        // Logical Operators: && (and), || (or), ! (not)
        boolean x = true;
        boolean y = false;

        System.out.println("\n----- Logical Operators -----");
        System.out.println("x && y: " + (x && y));   // true only if both x and y true (false)
        System.out.println("x || y: " + (x || y));   // true if any one of x or y true (true)
        System.out.println("!x: " + (!x));           // negation of x (false)

        // Assignment Operators: =, +=, -=, *=, /=, %=
        int num = 5;  // assign 5 to num

        System.out.println("\n----- Assignment Operators -----");
        System.out.println("Original num: " + num); // print original value

        num += 3;  // num = num + 3
        System.out.println("num += 3: " + num);     // prints 8

        num -= 2;  // num = num - 2
        System.out.println("num -= 2: " + num);     // prints 6

        num *= 4;  // num = num * 4
        System.out.println("num *= 4: " + num);     // prints 24

        num /= 2;  // num = num / 2
        System.out.println("num /= 2: " + num);     // prints 12

        num %= 3;  // num = num % 3 (remainder when num divided by 3)
        System.out.println("num %= 3: " + num);     // prints 0

        // Increment and Decrement Operators: ++ and --
        int value = 7;  // initialize value with 7

        System.out.println("\n----- Increment / Decrement Operators -----");
        System.out.println("Original value: " + value); // print original value 7

        value++;  // post-increment: increase value by 1 after this line
        System.out.println("value++: " + value);        // prints 8

        ++value;  // pre-increment: increase value by 1 before using it
        System.out.println("++value: " + value);        // prints 9

        value--;  // post-decrement: decrease value by 1 after this line
        System.out.println("value--: " + value);        // prints 8

        --value;  // pre-decrement: decrease value by 1 before using it
        System.out.println("--value: " + value);        // prints 7
    }
}
