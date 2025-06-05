//5. Print a right triangle pattern of numbers (1, 12, 123, etc.).


public class RightTrianglePattern1_12_123 {
         public static void main(String[] args) {

            for (int i = 1; i <= 5; i++) {

                for (int j = 1; j <=5-i; j++) {
                    System.out.print(" ");

                }

                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }

                System.out.println();
            }
        }
    }

