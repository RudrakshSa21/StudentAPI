package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student rudraksh = new Student("Rudraksh Sahni", "sahnirudraksh21@gmail.com", LocalDate.of(2003, MAY, 21));
            Student ansh = new Student("Ansh Gupta", "Anshg2003@gmail.com", LocalDate.of(2003, MAY, 28));
            repository.saveAll(List.of(rudraksh, ansh));
        };
    }
}
