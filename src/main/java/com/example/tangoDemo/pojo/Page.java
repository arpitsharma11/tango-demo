package com.example.tangoDemo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Page {
    private int elementPerBlock;
    private int number;
    private int resultCount;
    private int totalCount;
}
