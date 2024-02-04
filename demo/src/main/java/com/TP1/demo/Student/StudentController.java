package com.TP1.demo.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/Student")
public class StudentController {
    @Autowired
    private final StudentService studentservice;

    public StudentController(StudentService studentervice) {
        this.studentservice = studentervice;
    }

    @GetMapping(path="/testresponse")
    public ResponseEntity<String> testresponse( @RequestParam String name){
        return ResponseEntity.ok("test response");
    }

    @GetMapping
    public List<Student> GetStudents(){
        return studentservice.GetStudents();
    }

    @PostMapping(path="/add")
    public ResponseEntity registerNewStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentservice.addNewStudent(student));
    }

}
