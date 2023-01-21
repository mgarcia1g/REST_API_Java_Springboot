package com.RESTAPI.controller;

import com.RESTAPI.entity.Student;
import com.RESTAPI.response.StudentResponse;
import com.RESTAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // combination of @requestbody and @Controller annotation
@RequestMapping("/api/student/")
public class StudentController {

    @Value("${app.name}")
    private String appName;

    @Autowired
    StudentService studentService;

    @GetMapping("/getAll")
    public List<StudentResponse> getStudent(){
        List<Student> studentList = studentService.getAllStudents();
        List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>();

        studentList.stream().forEach(student -> {
            studentResponseList.add(new StudentResponse(student));
        });
       return studentResponseList;
    }







}
