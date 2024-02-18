package com.a2.a2.models;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface StudentRepo extends JpaRepository<Student, Integer>{
    Student findByFullName(String fullName);
    Student findByid(int id);
    String deleteByFullName(String fullName);
}
