package ForLoop;// 10. Print a Fibonacci series up to the nth number (user input).

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number");
            int num = sc.nextInt();
            int a=0, b=1;
            for (int i = 0; i <= num; i++) {
                System.out.println(a);
                int fac= a+b;

                a = b;
                b = fac;
            }

        }
    }


