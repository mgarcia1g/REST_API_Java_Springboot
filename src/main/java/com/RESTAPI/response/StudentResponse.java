package com.RESTAPI.response;

import com.RESTAPI.entity.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class StudentResponse {
    @JsonIgnore //hides from json response
    private long id;
    private String firstName;
    private String lastName;

    private String email;

    public StudentResponse(Student student){
        this.id=student.getId();
        this.firstName=student.getFirstName();
        this.lastName=student.getLastName();
        this.email=student.getEmail();
    }

}
