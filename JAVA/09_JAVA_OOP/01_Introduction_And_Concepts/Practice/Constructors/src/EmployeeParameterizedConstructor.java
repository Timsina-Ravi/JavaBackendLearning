
/**
 * Demonstrates parameterized constructor usage.
 * Class: Employee
 * Parameters: name, id, salary
 */
class Employee {
    String name;
    int id;
    double salary;

    // Parameterized constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("Salary: $" + salary);
        System.out.println();
    }
}

public class EmployeeParameterizedConstructor {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, 55000);
        Employee emp2 = new Employee("Bob", 102, 62000);

        emp1.displayInfo();
        emp2.displayInfo();
    }
}
