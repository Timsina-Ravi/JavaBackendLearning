import java.util.ArrayList;
import java.util.Scanner;

class StudentManager {

    ArrayList<student> students = new ArrayList<>();

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        boolean isFound = true;
        while (isFound) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Student Management System:");
            System.out.println("0. EXit From System: ");
            System.out.println("1. Add Students: ");
            System.out.println("2. List Student By ID: ");
            System.out.println("3. List all  Students: ");
            System.out.println("4. Update Student Details: ");
            System.out.println("5. Delete Student Details: ");


            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    isFound = false;
                    System.out.println("Exiting...");
                    break;

                case 1:
                    System.out.println("Enter Your Roll Number: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Your Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Your Course: ");
                    String course = sc.nextLine();
                    sm.addStudent(new student(rollNo, name, course));
                    System.out.println("Student Added Successfully");
                    break;

                case 2:
                    System.out.println("Enter Your Roll Number: ");
                    int rn = sc.nextInt();
                    sm.searchStudent(rn);
                    break;

                case 3:
                    sm.listStudents();
                    break;

                case 4:

                    System.out.println("Enter Roll Number To Update Details: ");
                    int newRollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Your New Name: ");
                    String newName = sc.nextLine();
                    System.out.println("Enter Your New Course: ");
                    String newCourse = sc.nextLine();
                    sm.updateStudent(newRollNo, newName, newCourse);
                    break;

                case 5:
                    System.out.println("Enter Roll Number To Delete Details: ");
                    int RollNo = sc.nextInt();
                    sm.deleteStudent(RollNo);
                    break;

                default:
                    System.out.println("Invalid Input, Enter a valid number");

            }


        }


    }

    public void addStudent(student std) {
        students.add(std);
    }

    public void searchStudent(int rollNo) {
        for (int i = 0; i <= students.size() - 1; i++) {
            if (students.get(i).getRollNo() == rollNo) {
                students.get(i).displayDetails();
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    public void listStudents() {
        for (int i = 0; i <= students.size() - 1; i++) {
            students.get(i).displayDetails();
        }
    }

    public void updateStudent(int rollNo, String newName, String newCourse) {
        for (int i = 0; i <= students.size() - 1; i++) {
            if (students.get(i).getRollNo() == rollNo) {
                students.get(i).setName(newName);
                students.get(i).setCourse(newCourse);
                System.out.println("Student details updated successfully");
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    public void deleteStudent(int rollNo) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNo() == rollNo) {
                students.remove(i);
                System.out.println("Student details deleted successfully");

                return;
            }
        }
        System.out.println("Student Not Found");

    }
}
