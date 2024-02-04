package com.TP1.demo.Student;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.*;

import java.security.PrivateKey;
import java.time.LocalDate;
@Entity
@Table
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)


   @Column(name = "emp_id")
    private Long id;
    @Column(name = "name")
    @JsonProperty("name")
  private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "dob")
    private LocalDate dob;
    @Column(name = "age")
    private Integer age;

    public Student() {
    }

    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }



}
