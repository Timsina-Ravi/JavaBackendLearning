// 🟠 Demonstration of the `private` keyword in inheritance
// Private members are NOT inherited by subclasses.

class Base {
    private void secret() {
        System.out.println("This is a private method");
    }

    public void show() {
        System.out.println("This is a public method");
    }
}

class Derived extends Base {
    void access() {
        // secret(); ❌ Error: private method not inherited
        show();   // ✅ Public method is inherited and accessible
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.access();
    }
}

