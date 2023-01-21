package com.RESTAPI.service;


import com.RESTAPI.entity.Student;
import com.RESTAPI.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
         return studentRepository.findAll();
    }
  
}
