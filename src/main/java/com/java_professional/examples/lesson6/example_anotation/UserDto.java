package com.java_professional.examples.lesson6.example_anotation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {

    @CsvField(name = "user_name")
    private String username;

    @CsvField(name = "passWord")
    private String password;

    @CsvField(name = "Email")
    private String email;

    @CsvField(name = "ADDRESS")
    private String address;
}
