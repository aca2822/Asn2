package com.a2.a2.models;

import jakarta.persistence.*;

@Entity
@Table(name="students")

public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private float weight=-1;
    private float height=-1;
    private String hairColor;
    private float GPA=-1;
    private float CGPA=-1;
    private String fullName;
    public Student(){

    }
    public Student(String firstName, String lastName, float weight, float height, String hairColor, float gPA,
            float cGPA, String fullName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
        this.hairColor = hairColor;
        GPA = gPA;
        CGPA = cGPA;
        this.fullName = firstName + " " + lastName;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        this.fullName = firstName + " " + lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public float getGPA() {
        return GPA;
    }
    public void setGPA(float gPA) {
        GPA = gPA;
    }
    public float getCGPA() {
        return CGPA;
    }
    public void setCGPA(float cGPA) {
        CGPA = cGPA;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
    
}