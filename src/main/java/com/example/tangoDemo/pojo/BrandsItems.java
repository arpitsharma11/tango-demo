package com.example.tangoDemo.pojo;

import lombok.Getter;

@Getter
public class BrandsItems {
    private String[] countries;
    private String createdDate;
    private String[] credentialTypes;
    private String currencyCode;
    private String exchangeRateRule;
    private int faceValue;
    private Boolean isWholeAmountValueRequired;
    private String lastUpdateDate;
    private float maxValue;
    private float minValue;
    private String redemptionInstructions;
    private String rewardName;
    private String rewardType;
    private String status;
    private String utid;
    private String valueType;

    public String[] getCountries() {
        return countries;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String[] getCredentialTypes() {
        return credentialTypes;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getExchangeRateRule() {
        return exchangeRateRule;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public Boolean getWholeAmountValueRequired() {
        return isWholeAmountValueRequired;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public float getMaxValue() {
        return maxValue;
    }

    public float getMinValue() {
        return minValue;
    }

    public String getRewardName() {
        return rewardName;
    }

    public String getRedemptionInstructions() {
        return redemptionInstructions;
    }

    public String getRewardType() {
        return rewardType;
    }

    public String getStatus() {
        return status;
    }

    public String getValueType() {
        return valueType;
    }

    public String getUtid() {
        return utid;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setCredentialTypes(String[] credentialTypes) {
        this.credentialTypes = credentialTypes;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setExchangeRateRule(String exchangeRateRule) {
        this.exchangeRateRule = exchangeRateRule;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public void setWholeAmountValueRequired(Boolean wholeAmountValueRequired) {
        isWholeAmountValueRequired = wholeAmountValueRequired;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public void setMaxValue(float maxValue) {
        this.maxValue = maxValue;
    }

    public void setMinValue(float minValue) {
        this.minValue = minValue;
    }

    public void setRedemptionInstructions(String redemptionInstructions) {
        this.redemptionInstructions = redemptionInstructions;
    }

    public void
    setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }

    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUtid(String utid) {
        this.utid = utid;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }
}
