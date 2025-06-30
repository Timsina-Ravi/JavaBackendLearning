// Interface declaring a common method
interface Animal {
    void sound(); // abstract method
}

// Dog class implements Animal interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class also implements Animal interface
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class MultipleImplementationsSameInterface {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // Interface reference to Dog object
        Animal a2 = new Cat(); // Interface reference to Cat object

        a1.sound(); // Calls Dog's implementation
        a2.sound(); // Calls Cat's implementation
    }
}

