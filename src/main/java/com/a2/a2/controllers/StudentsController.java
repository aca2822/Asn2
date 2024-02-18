package com.a2.a2.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


import com.a2.a2.models.*;

import jakarta.transaction.Transactional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;






@Controller
public class StudentsController {

    @Autowired
    private StudentRepo studentRepo;
    
    @GetMapping("showDB")
    public String getAllStudents(Model model){
        List<Student> students = studentRepo.findAll();
        model.addAttribute("st", students);

        return "DisStudent";
    }

    @PostMapping("addSomeStudents")
    public String testAddStudent(Model model) {
        Student student1 = new Student("John", "Smith", 100, 1.75f, "Black", 3.0f, 4.0f, "John Smith");
        Student student2 = new Student("Test", "Student", 0, 0, "None", 0, 0, "Test Student");
        Student student3 = new Student("Alice", "Smith", 100, 1.75f, "Black", 3, 4.0f, "Alice Smith");
        studentRepo.save(student1);
        studentRepo.save(student2);
        studentRepo.save(student3);
        
        return "mainPage";
    }

    @PostMapping("RemoveAllStudents")
    public String testRemoveAllStudents() {
        studentRepo.deleteAll();
        return "mainPage";
    }
    
    @PostMapping("addStudentToDB")
    public String addStudent(@RequestParam Map<String, String> newStudent){ 
        
        if(newStudent!= null){
            String firstName = newStudent.get("firstName");
            String lastName = newStudent.get("lastName");
            float weight=-1,height=-1,gPA=-1,cGPA=-1; 
            
            weight = Float.parseFloat(newStudent.get("weight"));
            height = Float.parseFloat(newStudent.get("height"));
            gPA = Float.parseFloat(newStudent.get("GPA"));
            cGPA = Float.parseFloat(newStudent.get("CGPA"));
            
            
            String hairColor = newStudent.get("hColor");
            
            String fullname = firstName + " " + lastName;
            studentRepo.save(new Student(firstName, lastName, weight, height, hairColor, gPA, cGPA,fullname));
            
        }
        

    
        return "mainPage";
    }
    @Transactional
    @PostMapping("DeleteByName")
    public String DeleteByName(@RequestParam Map<String, String> newStudent) {

        if(newStudent.containsKey("fullNameF")){
            String fullName = newStudent.get("fullNameF");
            studentRepo.deleteByFullName(fullName);
            
        }
        return "mainPage";
    }
   @Transactional
   @PostMapping("DeleteByID")
   public String DeleteByID(@RequestParam Map<String, String> newStudent) {
        if(newStudent.containsKey("fullIDF")){
        Integer fullID = Integer.parseInt(newStudent.get("fullIDF"));
        studentRepo.deleteById(fullID);
        
       }
       return "mainPage";
   }
   @Transactional
   @PostMapping("ModByName")
   public String postMethodName(@RequestParam Map<String, String> newStudent ,Model model) {
    if(newStudent.containsKey("fullNameF")){
        String fullName = newStudent.get("fullNameF");
        Student student = studentRepo.findByFullName(fullName);
        model.addAttribute("sts", student);
    }
    
       
    return "ModStudent";
   }
   @Transactional

   @PostMapping("ModByID")
   public String ModByID(@RequestParam Map<String, String> newStudent,Model model) {
    if(newStudent.containsKey("fullIDF")){
        Integer fullID = Integer.parseInt(newStudent.get("fullIDF"));
        Student student = studentRepo.findByid(fullID);
        model.addAttribute("sts", student);
    }
       return "ModStudent";
   }
 
   @PostMapping("ModStudentFromDB")
public String ModStudentFromDB(@RequestParam Map<String, String> newStudent) {
        String idValue = newStudent.get("ID");

    
        Integer studentId = Integer.parseInt(idValue);
        Student student = studentRepo.findByid(studentId);

    
        
        student.setFirstName(newStudent.get("firstName"));
        student.setLastName(newStudent.get("lastName"));
        
        
        student.setWeight(Float.parseFloat(newStudent.get("weight")));
        student.setHeight(Float.parseFloat(newStudent.get("height")));
        student.setGPA(Float.parseFloat(newStudent.get("GPA")));
        student.setCGPA(Float.parseFloat(newStudent.get("CGPA")));
    

        student.setHairColor(newStudent.get("hColor"));
        studentRepo.save(student);
       
    

    return "mainPage";
}

   
    


}
