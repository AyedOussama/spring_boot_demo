package com.TP1.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private  final StudentRepository studentRepository;
     @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> GetStudents() {
//        return List.of(
////                new Student(1L, "Mariem", "Mariem.ayed@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21)
//        );
        return studentRepository.findAll();
    }
    public Student addNewStudent(Student student){
        return studentRepository.save(student);
    }
}
