// API Layer

package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @Autowired
    private final StudentService studentService;

//    @Autowired - Either annotation will automatically instantiate the variable (studentService)
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // GET request
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    // POST request - when you want to add new resources to your system
    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    // DELETE request
    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }


}
