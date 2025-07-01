// Demonstrates protected access in inheritance

class Base {
    protected String language = "Java"; // Accessible in subclass

    protected void showLanguage() {
        System.out.println("Protected Language: " + language);
    }
}

class Derived extends Base {
    public void accessProtected() {
        showLanguage(); // OK because it's inherited
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.accessProtected(); // OK
    }
}

