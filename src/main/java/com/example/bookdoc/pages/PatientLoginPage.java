package com.example.bookdoc.pages;

import com.example.bookdoc.pages.uimaps.PatientLoginPageUImap;

public class PatientLoginPage {
    PatientLoginPageUImap patientLoginPageUImap;

    private PatientLoginPage() {
        patientLoginPageUImap = new PatientLoginPageUImap();
    }

    public PatientLoginPage typeId(String id){
        patientLoginPageUImap.getUserId().sendKeys(id);
        return this;
    }

    public PatientLoginPage typePassword(String password){
        patientLoginPageUImap.getPassword().sendKeys(password);
        return this;
    }

    public void clickLoginButton(){
        patientLoginPageUImap.getLogin().click();
    }

    public static PatientLoginPage getPatientLoginPage(){
        return new PatientLoginPage();
    }
}
