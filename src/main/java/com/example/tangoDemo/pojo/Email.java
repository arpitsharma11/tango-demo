package com.example.tangoDemo.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Email {
    private String email;
    private String firstName;
    private String lastName;

    public Email(){ };

    public Email(String email,String firstName,String lastname){
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastname;
    };
}
