package ForLoop;
//         5. Reverse a number (e.g., 123 → 321).

import java.util.Scanner;


public class ReverseNumber {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();
            int reversed =0;
            while (num != 0) {

                int lastdigit = num % 10;
                reversed = reversed * 10 + lastdigit;
                num = num / 10;
            }
            System.out.println(reversed);


        }
    }

