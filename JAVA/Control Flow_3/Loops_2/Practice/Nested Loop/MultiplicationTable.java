//3.Print a multiplication table (1-10) using nested loops.

public class MultiplicationTable {


        public static void main(String[] args) {
            for (int i = 1; i <=10 ; i++) {
                for (int j = 1; j <=10 ; j++) {
                    System.out.print( i + " * "+j+" = "+ i*j +"\t");
                }
                System.out.println();
            }
        }
    }


