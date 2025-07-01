// Demonstrates private access modifier

class PrivateModifierExample {
    private int age = 25; // Only accessible inside this class

    private void showAge() {
        System.out.println("Private Age: " + age);
    }

    public void accessPrivate() {
        // Allowed: accessing private method from within the same class
        showAge();
    }

    public static void main(String[] args) {
        PrivateModifierExample obj = new PrivateModifierExample();
        obj.accessPrivate(); // OK
        // obj.age or obj.showAge() would cause compile error
    }
}

