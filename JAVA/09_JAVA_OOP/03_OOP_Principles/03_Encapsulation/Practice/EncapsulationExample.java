//  ENCAPSULATION EXAMPLE IN JAVA

// Class with encapsulated data
public class Person {

    // 1. Private data members — only accessible within this class
    private String name;
    private int age;

    // 2. Public getter method for 'name' — allows controlled read access
    public String getName() {
        return name;
    }

    // 3. Public setter method for 'name' — allows controlled write access
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    public void setAge(int age) {
        // Optional: validation logic can be added here
        if (age >= 0) {
            this.age = age;
        }
    }
}

// Another class to test encapsulation
class EncapsulationExample {
    public static void main(String[] args) {

        // Creating an object of the Person class
        Person p = new Person();

        //  Using setter methods to assign values
        p.setName("Ravi");
        p.setAge(25);

        //  Using getter methods to access values
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        //  Cannot access 'name' or 'age' directly due to private access
        // p.name = "John";        // ERROR
        // int a = p.age;          // ERROR
    }
}

