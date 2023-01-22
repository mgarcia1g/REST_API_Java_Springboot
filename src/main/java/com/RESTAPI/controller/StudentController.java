package com.RESTAPI.controller;

import com.RESTAPI.entity.Student;
import com.RESTAPI.request.CreateStudentRequest;
import com.RESTAPI.response.StudentResponse;
import com.RESTAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // combination of @requestbody and @Controller annotation
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getAll")
    public List<StudentResponse> getStudent(){
        List<Student>studentList = studentService.getAllStudents();
        List<StudentResponse>studentResponseList = new ArrayList<StudentResponse>();
        studentList.stream().forEach(student -> {
            studentResponseList.add(new StudentResponse(student));
        });
       return studentResponseList;
    }

    @PostMapping("/create")
    public StudentResponse createStudent(@RequestBody CreateStudentRequest createStudentRequest){ //@RequestBody is converting json coming in request payload to model class
    Student student =studentService.createStudent(createStudentRequest);
    return new StudentResponse(student);
    }




}
