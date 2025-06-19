package WhileLoop;//2. Print the sum of numbers from 1 to N (user input).


public class SumOfNumbers1_N {
        public static void main(String[] args) {
            int i = 0;
            int sum = 0;
            while (i <= 100) {

                sum+=i;
                i++;
            }

            System.out.println("The sum of 1 to 100 numbers is " + sum);
        }
    }

