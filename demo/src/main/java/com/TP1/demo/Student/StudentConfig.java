package com.TP1.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariem =new Student( "Mariem", "Mariem.ayed@gmail.com", LocalDate.of(2001, Month.JANUARY, 2), 22);
            Student samir =new Student( "Samir", "Samir.Mahmoud@gmail.com", LocalDate.of(2002, Month.JANUARY, 3), 23);
         repository.saveAll(List.of(mariem,samir));
        };
    }

}
