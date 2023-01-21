package com.RESTAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue //to increment in db
    @Column(name="id")
    @JsonIgnore
    private Long id;
    @Column(name="first_Name")
    private String firstName;
    @Column(name="last_Name")
    private String lastName;
    @Column(name="email")
    private String email;

}
