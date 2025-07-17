import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ManagementSystem managementSystem = new ManagementSystem();
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit){
            System.out.println("Welcome to management system");
            System.out.println("1. Add student");
            System.out.println("2. View students");
            System.out.println("3. view Students By RollNo");
            System.out.println("4. Update Student By RollNo");
            System.out.println("5. Delete Student By RollNo");
            System.out.println("6. Exit");


            System.out.println("Enter YOur Choice:");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter your rollNo");
                    int rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your name");
                    String name = sc.nextLine();
                    System.out.println("Enter your age");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your gender");
                    String gender = sc.nextLine();
                    System.out.println("Enter your grade");
                    String grade = sc.nextLine();
                    managementSystem.addStudent(new Student(rollNo, name, age, gender, grade));
                    break;


                case 2:
                    for (Student student : managementSystem.viewStudents()) {
                        System.out.println(student);
                    }
                    break;


                case 3:
                    System.out.println("Enter your rollNo");
                    int rollNo1 = sc.nextInt();
                    managementSystem.viewStudentByRollNo(rollNo1);
                    break;


                case 4:
                    System.out.println("Enter your rollNo");
                    int rollNoToUpdate = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your name");
                    String updatedName = sc.nextLine();
                    System.out.println("Enter your age");
                    int updatedAge = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your gender");
                    String updatedGender = sc.nextLine();
                    System.out.println("Enter your grade");
                    String updatedGrade = sc.nextLine();

                    Student updatedStudent = new Student(rollNoToUpdate, updatedName, updatedAge, updatedGender, updatedGrade);
                    managementSystem.updateStudent(rollNoToUpdate, updatedStudent);
                    break;


                case 5:
                    System.out.println("Enter your rollNo");
                    int rollNo2 = sc.nextInt();
                    managementSystem.removeStudent(rollNo2);
                    break;

                    case 6:
                    System.out.println("EXiting..........");
                    exit = false;
                    break;


                    }

            }
        }
    }

