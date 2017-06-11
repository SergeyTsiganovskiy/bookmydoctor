package com.example.bookdoc.pages;

import com.example.bookdoc.pages.uimaps.AdminPageUImap;

public class AdminPage {
    private AdminPageUImap adminPageUImap;

    public AdminPage() {
        adminPageUImap = new AdminPageUImap();
    }

    public static AdminPage getAdminPage(){
        return new AdminPage();
    }

    public String getHeaderText(){
        return adminPageUImap.getHeader().getText();
    }

    public String getWelcomFieldText(){
        return adminPageUImap.getWelcomeField().getText();
    }

    public String getErrorMessageText(){
        return adminPageUImap.getErrorMessageField().getText();
    }

    public void clickCreateDoctorButton(){
        adminPageUImap.getCreateDoctorButton().click();
    }

    public void clickDeleteDoctorButton(){
        adminPageUImap.getDeleteDoctorButton().click();
    }

    public void typeDoctorPin(String pin){
        adminPageUImap.getDeleteDoctorInput().sendKeys(pin);
    }

    public void clickDeletePatientButton(){
        adminPageUImap.getDeletePatientButton().click();
    }

    public void typePatientId(String id){
        adminPageUImap.getDeletePatientInput().sendKeys(id);
    }

    public void clickApproveLeaveButton(){
        adminPageUImap.getApproveLeaveButton().click();
    }
    public void clickLogOutLink(){adminPageUImap.getlogoutButton().click();}

    public String getGeneratedPin(){
        return adminPageUImap.getGeneratedPin().getText();
    }

}
