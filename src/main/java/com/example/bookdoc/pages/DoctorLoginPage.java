package com.example.bookdoc.pages;

import com.example.bookdoc.pages.uimaps.DoctorLoginPageUImap;

public class DoctorLoginPage {
    DoctorLoginPageUImap doctorLoginPageUImap;

    private DoctorLoginPage() {
        doctorLoginPageUImap = new DoctorLoginPageUImap();
    }

    public String getNewIdText(){
        return doctorLoginPageUImap.getNewId().getText();
    }

    public DoctorLoginPage typeId(String id){
        doctorLoginPageUImap.getUserId().sendKeys(id);
        return this;
    }

    public DoctorLoginPage typePassword(String password){
        doctorLoginPageUImap.getPassword().sendKeys(password);
        return this;
    }

    public void clickLoginButton(){
        doctorLoginPageUImap.getLogin().click();
    }

    public static DoctorLoginPage getDoctorLoginPage(){
        return new DoctorLoginPage();
    }
}
