package com.example.tangoDemo.pojo;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Brands {
    private String brandKey;
    private String brandName;
    private BrandRequirements brandRequirements;
    private String createdDate;
    private String description;
    private BrandsItems[] items;
    private String lastUpdateDate;
    private String shortDescription;
    private String status;
    private String terms;
}
