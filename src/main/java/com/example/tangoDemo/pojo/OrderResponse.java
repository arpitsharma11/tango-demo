package com.example.tangoDemo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderResponse {
    private String accountIdentifier;
    private AmountCharged amountCharged;
    private String  campaign;
    private String createdAt;
    private String  customerIdentifier;
    private AmountCharged denomination;
    private String emailSubject;
    private String externalRefID;
    private String message;
    private Email recipient;
    private String redemptionInstructions;
    private String referenceOrderID;
    private String rewardName;
    private String sendEmail;
    private Email sender;
    private String status;
    private String utid;
}
