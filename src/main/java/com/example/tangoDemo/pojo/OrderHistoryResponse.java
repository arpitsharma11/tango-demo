package com.example.tangoDemo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class OrderHistoryResponse {
    private OrderResponse[] orders;
    private Page page;
}
