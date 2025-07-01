// Demonstrates default access (no modifier)

class DefaultModifierExample {
    int score = 100; // default: only accessible in same package

    void showScore() {
        System.out.println("Default Score: " + score);
    }

    public static void main(String[] args) {
        DefaultModifierExample obj = new DefaultModifierExample();
        obj.showScore(); // OK
    }
}

