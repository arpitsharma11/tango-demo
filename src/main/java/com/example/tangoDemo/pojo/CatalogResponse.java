package com.example.tangoDemo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
public class CatalogResponse {
    private Brands[] brands;
    private String catalogName;
}
