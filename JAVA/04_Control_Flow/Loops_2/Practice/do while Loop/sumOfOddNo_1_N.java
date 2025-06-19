//4.Calculate the sum of odd numbers between 1 and N using do-while.


import java.util.Scanner;

public class sumOfOddNo_1_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        do {
            if (i % 2 != 0) {
                sum = sum + i;
            }
            i++;
        } while (i <= num);
        System.out.println("The odd numbers between 1 to N is " + sum);
    }
}

