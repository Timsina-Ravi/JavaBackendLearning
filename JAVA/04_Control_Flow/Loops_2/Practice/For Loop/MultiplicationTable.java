package ForLoop;
//    3. Print the multiplication table of a number.

import java.util.Scanner;
public class MultiplicationTable {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number ");
            int mul = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println("The multiplication of "+mul +" is " + mul*i);
            }


        }
    }

