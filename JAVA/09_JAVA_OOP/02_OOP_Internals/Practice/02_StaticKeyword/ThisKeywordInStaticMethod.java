

//Try using this inside a static method. What happens?

public class ThisKeywordInStaticMethod {
    int a = 10;

    public static void main(String[] args) {
        // ❌ Error: 'this' cannot be used in a static context
        // System.out.println(this.a);

        // ✅ Fix: Create object to access instance variable
        ThisInStatic obj = new ThisInStatic();
        System.out.println("Using object instead: " + obj.a);
    }
}

