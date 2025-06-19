// 7.Generate Fibonacci numbers until a certain value (user input).

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        int a = 0, b = 1;
        do {
            System.out.println("Fibonacci numbers: " + a);
            int fib = a + b;
            a = b;
            b = fib;
        } while (a <= num);
        sc.close();
    }
}


