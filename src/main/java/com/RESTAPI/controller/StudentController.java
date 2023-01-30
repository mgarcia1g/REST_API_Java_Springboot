package com.RESTAPI.controller;

import com.RESTAPI.entity.Student;
import com.RESTAPI.request.CreateStudentRequest;
import com.RESTAPI.request.DeleteStudentRequest;
import com.RESTAPI.request.UpdateStudentRequest;
import com.RESTAPI.response.StudentResponse;
import com.RESTAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public StudentResponse createStudent(@Valid @RequestBody CreateStudentRequest createStudentRequest){ //@RequestBody is converting json coming in request payload to model class //@Valid validates all @NotBlank validations on model class (creatstudentrequest) in this instance
    Student student =studentService.createStudent(createStudentRequest);
    return new StudentResponse(student);
    }

    @PutMapping("/updateStudent")
    public StudentResponse updateStudent(@Valid @RequestBody UpdateStudentRequest updateStudentRequest){
        Student student = studentService.updateStudent(updateStudentRequest);

        return new StudentResponse(student);
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam long id){
        return studentService.deleteStudent(id);
    }




}
