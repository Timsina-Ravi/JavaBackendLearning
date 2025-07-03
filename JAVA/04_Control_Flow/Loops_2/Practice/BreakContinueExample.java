public class BreakContinueExample {
    public static void main(String[] args) {
        // Demonstrate break and continue in a loop
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Break at i = " + i);
                break; // exit the loop when i == 6
            }
            if (i % 2 == 0) {
                System.out.println("Continue at i = " + i);
                continue; // skip even numbers' print below
            }
            System.out.println("Number: " + i);
        }
    }
}

