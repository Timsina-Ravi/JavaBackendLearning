package WhileLoop;//7. Print prime numbers between 1 and 100.

public class PrimeNUmber1_100 {

        public static void main(String[] args) {
            int i = 2;
            while (i <= 100) {
                int j = 2;
                boolean isPrime = true;
                while (j < i) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                    j++;
                }
                if (isPrime) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }

