package com.RESTAPI.service;


import com.RESTAPI.entity.Student;
import com.RESTAPI.repository.StudentRepository;
import com.RESTAPI.request.CreateStudentRequest;
import com.RESTAPI.request.DeleteStudentRequest;
import com.RESTAPI.request.UpdateStudentRequest;
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

    public Student updateStudent(UpdateStudentRequest updateStudentRequest){
      Student student =  studentRepository.findById(updateStudentRequest.getId()).get();
      if(updateStudentRequest.getFirstName() != null & !updateStudentRequest.getFirstName().isEmpty()){
          student.setFirstName(updateStudentRequest.getFirstName());
      }
        else if(updateStudentRequest.getLastname() != null & !updateStudentRequest.getLastname().isEmpty()){
            student.setLastName(updateStudentRequest.getLastname());
        }
        else if(updateStudentRequest.getEmail() != null & !updateStudentRequest.getEmail().isEmpty()){
            student.setEmail(updateStudentRequest.getEmail());
        }
        student = studentRepository.save(student);
        return student;
    }

    public String deleteStudent(long id){
       studentRepository.deleteById(id);

        return  "Student deleted";
    }
}
