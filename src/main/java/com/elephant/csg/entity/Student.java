package com.elephant.csg.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Student {

    private @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String lastName;

    private Student() {}

    public Student(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}