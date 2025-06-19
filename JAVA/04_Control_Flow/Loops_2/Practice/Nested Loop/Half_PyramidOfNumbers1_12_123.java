//2. Print a half-pyramid of numbers (1, 12, 123, etc.).

import java.util.Scanner;

public class Half_PyramidOfNumbers1_12_123 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number");
            int num = sc.nextInt();
            for (int i = 1; i <=num ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }

