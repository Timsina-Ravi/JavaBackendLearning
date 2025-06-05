package ForLoop;
//4. Print a pattern like:
//        *
//        **
//        ***
//        ****

public class PrintPattern_1234 {


        public static void main(String[] args) {

            for (int i = 1; i <=4 ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
