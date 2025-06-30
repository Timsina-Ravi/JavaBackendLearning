// Interface defines a contract
interface Printable {
    void print(); // Abstract method (implicitly public and abstract)
}

// Class implements the interface and provides method body
class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

public class BasicInterfaceImplementation {
    public static void main(String[] args) {
        Document doc = new Document(); // Creating object of implementing class
        doc.print();                   // Calls implemented method
    }
}

