package com.RESTAPI.service;


import com.RESTAPI.entity.Student;
import com.RESTAPI.repository.StudentRepository;
import com.RESTAPI.request.CreateStudentRequest;
import com.RESTAPI.response.StudentResponse;
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

    public Student createStudent(CreateStudentRequest createStudentRequest){
        Student student = new Student(createStudentRequest);
       student =  studentRepository.save(student);
       return student;
    }
}
