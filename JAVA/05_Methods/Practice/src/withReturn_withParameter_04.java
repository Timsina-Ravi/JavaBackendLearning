public class withReturn_withParameter_04 {

    // Function takes two parameters and returns their sum
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Call the function with arguments and store the result
        int sum = addTwoNumbers(5, 7);
        System.out.println("Sum is: " + sum);
    }
}
