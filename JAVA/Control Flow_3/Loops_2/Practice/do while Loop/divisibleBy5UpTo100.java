//3.Print numbers divisible by 5 up to 100.


public class divisibleBy5UpTo100 {

    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println("The numbers between 1 to 100 that is divisible by 5 is " + i);
            }
            i++;
        } while (i <= 100);
    }
}

