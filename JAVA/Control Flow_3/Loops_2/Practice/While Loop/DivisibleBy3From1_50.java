package WhileLoop;//3. Print numbers divisible by 3 between 1 and 50.


public class DivisibleBy3From1_50 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            if (i % 3 == 0) {
                System.out.println("The multiple of 3 between 1 to 50 is " + i);
            }
            i++;
        }
    }
}
