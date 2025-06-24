
Create a class inside a package and use it from another file using import.

// Importing user-defined class from package
import mypackage.MyClass;

public class TestPackage {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // create object from imported class
        obj.greet(); // call its method
    }
}

