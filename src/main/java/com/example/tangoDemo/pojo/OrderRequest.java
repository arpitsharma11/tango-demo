package com.example.tangoDemo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class OrderRequest {
    private String accountIdentifier;
    private Float amount;
    private String campaign;
    private String customerIdentifier;
    private  String emailSubject;
    private String etid;
    private String externalRefID;
    private String message;
    private String notes;
    private Email recipient;
    private Boolean sendEmail;
    private Email sender;
    private String utid;
}
