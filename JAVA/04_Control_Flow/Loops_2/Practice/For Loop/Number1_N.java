package ForLoop;
//1. Print numbers from 1 to N.

import java.util.Scanner;

public class Number1_N {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
         for(int i =1; i<=n;i++){
         System.out.println("The numbers between 1 to N is " + i);
         }



    }
}

