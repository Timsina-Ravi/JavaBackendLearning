public class withReturn_noParameter_02 {

    // A function that returns an int and takes no parameters
    public static int getLuckyNumber() {
        return 7; // returning a number
    }

    public static void main(String[] args) {
        // Store the returned value in a variable
        int number = getLuckyNumber();
        System.out.println("Your lucky number is: " + number);
    }
}
