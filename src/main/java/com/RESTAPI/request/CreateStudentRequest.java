package com.RESTAPI.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
public class CreateStudentRequest {
    @NotBlank(message="First name is required") //validation from @valid in controller for field
    private String firstName;
    @NotBlank(message="Last name is required")//validation from @valid in controller for field
    private String lastName;
    @NotBlank(message="Email is required")//validation from @valid in controller for field
    private String email;
}
