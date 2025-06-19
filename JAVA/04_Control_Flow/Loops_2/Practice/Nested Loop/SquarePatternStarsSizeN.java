
//1. Print a square pattern of stars of size N.


import java.util.Scanner;

public class SquarePatternStarsSizeN {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number");
            int num1= sc.nextInt();
            for (int i = 0; i <num1 ; i++) {
                for (int j = 0; j <num1 ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

