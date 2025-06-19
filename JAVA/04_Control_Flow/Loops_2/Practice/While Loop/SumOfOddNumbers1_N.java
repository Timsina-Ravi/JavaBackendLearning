package WhileLoop;
//5.Calculate the sum of odd numbers from 1 to N (user input).

import java.util.Scanner;

public class SumOfOddNumbers1_N {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a numner");
            int num = sc.nextInt();
            int i=1;
            int sum =0;
            while (i<=num) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                sum = sum+i;
                i++;
            }
            System.out.println("The sum of odd numbers between 1 to N is "+ sum);
        }
    }


