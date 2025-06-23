
/**
 * Demonstrates default constructor usage.
 * Class: Student
 * Initializes default values for name, rollNo, and grade.
 */
class Student {
    String name;
    int rollNo;
    char grade;

    // Default constructor
    Student() {
        name = "John Doe";
        rollNo = 1;
        grade = 'A';
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
    }
}

public class StudentDefaultConstructor {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayInfo();
    }
}
