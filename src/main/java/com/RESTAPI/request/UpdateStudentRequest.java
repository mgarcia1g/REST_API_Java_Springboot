package com.RESTAPI.request;

import com.RESTAPI.entity.Student;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UpdateStudentRequest {
    @NotNull(message = "Student ID is required")
    private Long id;
    private String firstName;
    private String lastname;
    private String email;




}
