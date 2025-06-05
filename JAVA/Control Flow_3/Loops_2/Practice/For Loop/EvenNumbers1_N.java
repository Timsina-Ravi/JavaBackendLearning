package ForLoop;// 2. Print all even numbers between 1 and N.

import java.util.Scanner;

public class EvenNumbers1_N {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number ");
            int N = sc.nextInt();

            for (int i = 0; i <=N ; i++) {
                if(i%2==0){
                    System.out.println("The Even Numbers between 1 to N is " + i);
                }
            }


        }
    }

