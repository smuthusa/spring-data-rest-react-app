package com.elephant.csg.dao;

import com.elephant.csg.entity.College;
import com.elephant.csg.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final StudentRepository repository;
    private final CollegeRepository collegeRepository;

    @Autowired
    public DatabaseLoader(StudentRepository repository, CollegeRepository collegeRepository) {
        this.repository = repository;
        this.collegeRepository = collegeRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Student("Mani", "Kumar", "Welcome"));
        this.collegeRepository.save(new College("IIT", 1L, 1, "Guindy,Chennai", new Date()));
        this.collegeRepository.save(new College("REC", 2L, 1, "Guindy,Trichy", new Date()));
    }
}