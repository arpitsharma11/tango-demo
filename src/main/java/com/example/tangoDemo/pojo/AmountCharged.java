package com.example.tangoDemo.pojo;

import lombok.Getter;

@Getter
public class AmountCharged {
    private String currencyCode;
    private String exchangeRate;
    private float fee;
    private float total;
    private float value;
}
