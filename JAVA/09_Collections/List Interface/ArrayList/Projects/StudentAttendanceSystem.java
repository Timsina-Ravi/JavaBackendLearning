/*`ArrayList` (Dynamic Arrays, Indexing)

   - Use `ArrayList` to store student names
   - Handle duplicates with validation
   - Use OOP (`Student` class) + Exception Handling*/

import java.util.ArrayList;
import java.util.Scanner;

class DuplicateStudentException extends Exception{
    public DuplicateStudentException(String message){
        super(message);
    }
}
class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class AttendanceSystem{
    ArrayList<Student> students ;

    public AttendanceSystem(){
        students= new ArrayList<>();
    }
    // Method to Add Student (Throws Exception if Duplicate)

    public void addStudent(Student student)throws DuplicateStudentException {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(student.getName())) {
                throw new DuplicateStudentException("Error: student " + student.getName() + " is already in the list");
            }
        }
            students.add(student);
            System.out.println("Student:" + student.getName() + " added successfullt");
    }

    // Method to remove student by name
    public void removeStudent(String name){
        for (int i = students.size()-1;i >= 0;i--){
            if (students.get(i).getName().equalsIgnoreCase(name)){
            students.remove(i);
            System.out.println("Student removed successfully");
            return;
            }

        }
        System.out.println("Error: student not found");
    }

    // Method to Display All Students
public void displayStudent(){
        if (students.isEmpty()){
            System.out.println("No students in the attendance list");
        return;
        }
        System.out.println("Student Attendance List");
for (Student student : students){
    System.out.println("-" + student.getName());
}
    }
}
public class StudentAttendanceSystem {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        while (true){
            System.out.println("Student Attendance System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
              int choice=-1;
              try {
                  choice=Integer.parseInt(scanner.nextLine());

              }catch (NumberFormatException e){
                System.out.println("Invalid input! Please enter a number between 1 to 4");
              continue;
              }
              switch (choice) {
                  case 1:
                      System.out.println("Enter student name to add");
                      String newName = scanner.nextLine();
                      try {
                          attendanceSystem.addStudent(new Student(newName));
                      } catch (DuplicateStudentException e) {
                          System.out.println(e.getMessage());
                      }
                      break;

                  case 2:
                      System.out.println("Enter student name to remove");
                      String nameToRemove = scanner.nextLine();
                      attendanceSystem.removeStudent(nameToRemove);
                      break;


                  case 3:
               attendanceSystem.displayStudent();
               break;

                  case 4:
                      System.out.println("Exiting the system");
                      scanner.close();
                      return;
                  default:
                      System.out.println("Invalid choice! Please select a valid option.");
              }
        }
    }
}



