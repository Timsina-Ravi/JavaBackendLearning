//6. Print an inverted right triangle of stars.

import java.util.Scanner;

public class InvertedRightTriangle {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to print stars");
            int num = sc.nextInt();
            for (int i = 0; i <num; i++) {

                for (int j = 0; j <num-i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
    }

