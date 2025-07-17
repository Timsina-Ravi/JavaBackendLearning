import java.util.ArrayList;

public class ManagementSystem {
ArrayList<Student> students = new ArrayList<>();



public void addStudent(Student student) {


        students.add(student);
    System.out.println("Student added successfully");
    }

    public ArrayList<Student> viewStudents(){
    return students;

    }

    public void viewStudentByRollNo(int rollNo) {
        boolean found = false;
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }


    public void updateStudent(int rollNo, Student updatedStudent) {
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNo() == rollNo) {
                students.set(i, updatedStudent);
                found = true;
                System.out.println("Student updated successfully");
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found, update failed");
        }
    }




    public void removeStudent(int rollNo) {
    boolean found = false;
        for (int i = 0; i < students.size() ; i++) {
            if (students.get(i).getRollNo() == rollNo) {
                students.remove(i);
                found = true;
                break;
            }
        }
        if (!found){

            System.out.println("Student not found");
        }


    }
}
