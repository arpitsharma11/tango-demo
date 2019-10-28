package com.example.tangoDemo.pojo;

import lombok.Getter;

@Getter
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

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public String getBrandKey() {
        return brandKey;
    }

    public BrandsItems[] getItems() {
        return items;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getTerms() {
        return terms;
    }

    public void setBrandKey(String brandKey) {
        this.brandKey = brandKey;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public BrandRequirements getBrandRequirements() {
        return brandRequirements;
    }

    public void setBrandRequirements(BrandRequirements brandRequirements) {
        this.brandRequirements = brandRequirements;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItems(BrandsItems[] items) {
        this.items = items;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }
}
