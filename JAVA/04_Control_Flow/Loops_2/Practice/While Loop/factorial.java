package WhileLoop;//4. Calculate the factorial of a number using a while loop.

import java.util.Scanner;

public class factorial {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();
            int fac= 1;
            int i=1;
            while (i<=num){
                fac = fac*i;
                i++;

            }
            System.out.println("The factorial of a number is "+ fac);


        }
    }

