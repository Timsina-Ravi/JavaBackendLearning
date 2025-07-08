package StudentManagementAPI.controller;


import StudentManagementAPI.Model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class StudentManagementApi{
    List<Student> students = new ArrayList<>();

    @PostMapping
    public String add(@RequestBody Student student) {
        students.add(student);
        return "Added Successfully";
    }

    @GetMapping
    public List<Student> view() {
        return students;
    }

    @GetMapping("/{id}")
    public String viewByID(@PathVariable int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                return students.toString();
            }
        }
        return "Student Not Found! ";
    }

    // while sending garde we have to send it raw no jason ex --  90.2 --->just like this
    @PutMapping("/{newName}")
    public String update(@PathVariable String newName, @RequestBody Double newGrades) {
        for (Student student : students) {
            if (student.getName().equals(newName)) {
                student.setGrades(newGrades);
                return "Student Grades Updated Successfully";
            }
        }
        return "NO student found";
    }

    // to delete with id we just have to enter id after / in http no need to send it from body.....
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        Student deleteData = null;
        for (Student student : students) {
            if (student.getId() == id) {
                deleteData = student;
                break;

            }
        }
        if (students != null) {
            students.remove(deleteData);
            return "Student removed Successfully ";
        }

        return "NO Student Found";
    }


}



