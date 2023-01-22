package com.RESTAPI.entity;

import com.RESTAPI.request.CreateStudentRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //to increment in db
    @Column(name="id")
    @JsonIgnore
    private Long id;
    @Column(name="first_Name")
    private String firstName;
    @Column(name="last_Name")
    private String lastName;
    @Column(name="email")
    private String email;

    public Student (CreateStudentRequest createStudentRequest){
        this.firstName=createStudentRequest.getFirstName();
        this.lastName=createStudentRequest.getLastName();
        this.email=createStudentRequest.getEmail();
    }

}
