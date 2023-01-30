package com.RESTAPI.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DeleteStudentRequest {
    @NotNull(message = "Student ID is required")
    private Long id;
    private String firstName;
    private String lastname;
    private String email;
}
