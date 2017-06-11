package com.example.bookdoc.pages;

import com.example.bookdoc.pages.uimaps.FullNavigationSideBarUIMap;

public class FullNavigationSideBar {
    private FullNavigationSideBarUIMap fullNavigationSideBarUIMap;

    private FullNavigationSideBar() {
         fullNavigationSideBarUIMap = new FullNavigationSideBarUIMap();
    }

    public void clickHomeLink() {
        fullNavigationSideBarUIMap.getHomeLink().click();
    }

    public PatientRegistrationPage clickPatientRegistrationLink() {
        fullNavigationSideBarUIMap.getPatientRegistrationLink().click();
        return new PatientRegistrationPage();
    }

    public DoctorRegistrationPage clickDoctorRegistrationLink() {
        fullNavigationSideBarUIMap.getDoctorRegistrationLink().click();
        return DoctorRegistrationPage.getDoctorRegistrationPage();
    }

    public PatientLoginPage clickPatientLoginLink() {
        fullNavigationSideBarUIMap.getPatientLoginLink().click();
        return PatientLoginPage.getPatientLoginPage();
    }

    public DoctorLoginPage clickDoctorLoginLink() {
        fullNavigationSideBarUIMap.getDoctorLoginLink().click();
        return DoctorLoginPage.getDoctorLoginPage();
    }

    public void clickAdminLoginLink() {
        fullNavigationSideBarUIMap.getAdminLoginLink().click();

    }

    public void clickCreateDoctorLink() {
        fullNavigationSideBarUIMap.getCreateDoctorLink().click();

    }

    public void clickLogOutLink(){
        fullNavigationSideBarUIMap.getLogoutLink().click();
    }

    public void clickDeleteDoctorLink() {
        fullNavigationSideBarUIMap.getDeleteDoctorLink().click();

    }

    public void clickDeletePatientLink() {
        fullNavigationSideBarUIMap.getDeletePatientLink().click();

    }

    public void clickApproveDoctorsLeaveLink() {
        fullNavigationSideBarUIMap.getApproveDoctorsLeaveLink().click();

    }

    public String getApproveDoctorsLeaveLinkText(){
        return fullNavigationSideBarUIMap.getApproveDoctorsLeaveLink().getText();
    }

    public String getViewPrescriptionLinkText(){
        return fullNavigationSideBarUIMap.getViewPrescriptionLinkLink().getText();
    }
    public static FullNavigationSideBar getNavigationSideBar(){
        return new FullNavigationSideBar();
    }
}
