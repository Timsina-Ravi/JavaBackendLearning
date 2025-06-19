//2. Print the factorial of a number.

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        int fac = 1, i = 1;
        do {
            fac = fac * i;
            i++;
        } while (i <= num);

        System.out.println("The factorail of a number is " + fac);

    }
}