package com.RESTAPI.response;

import com.RESTAPI.entity.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
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
