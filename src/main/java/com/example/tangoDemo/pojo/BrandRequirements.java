package com.example.tangoDemo.pojo;

import lombok.Getter;

@Getter
public class BrandRequirements {
    private Boolean alwaysShowDisclaimer;
    private String disclaimerInstructions;
    private String displayInstructions;
    private String termsAndConditionsInstructions;

    public Boolean getAlwaysShowDisclaimer() {
        return alwaysShowDisclaimer;
    }

    public String getDisclaimerInstructions() {
        return disclaimerInstructions;
    }

    public String getDisplayInstructions() {
        return displayInstructions;
    }

    public String getTermsAndConditionsInstructions() {
        return termsAndConditionsInstructions;
    }

    public void setAlwaysShowDisclaimer(Boolean alwaysShowDisclaimer) {
        this.alwaysShowDisclaimer = alwaysShowDisclaimer;
    }

    public void setDisclaimerInstructions(String disclaimerInstructions) {
        this.disclaimerInstructions = disclaimerInstructions;
    }

    public void setDisplayInstructions(String displayInstructions) {
        this.displayInstructions = displayInstructions;
    }

    public void setTermsAndConditionsInstructions(String termsAndConditionsInstructions) {
        this.termsAndConditionsInstructions = termsAndConditionsInstructions;
    }
}
