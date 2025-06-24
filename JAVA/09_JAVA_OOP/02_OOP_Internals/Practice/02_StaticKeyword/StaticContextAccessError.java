

//Try accessing a non-static variable from a static method — fix the error using an object.

public class StaticContextAccessError {
    int instanceVar = 42; // non-static variable

    public static void main(String[] args) {
        // ❌ Error: Cannot access non-static variable directly in static method
        // System.out.println(instanceVar);

        // ✅ Fix: Use an object to access non-static members
        StaticAccessError obj = new StaticAccessError();
        System.out.println("Accessing non-static variable: " + obj.instanceVar);
    }
}

