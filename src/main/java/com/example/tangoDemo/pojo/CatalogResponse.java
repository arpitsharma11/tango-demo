package com.example.tangoDemo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class CatalogResponse {
    private Brands[] brands;
    private String catalogName;

    public String getCatalogName() {
        return catalogName;
    }

    public Brands[] getBrands() {
        return brands;
    }


    public void setBrands(Brands[] brands) {
        this.brands = brands;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
}
