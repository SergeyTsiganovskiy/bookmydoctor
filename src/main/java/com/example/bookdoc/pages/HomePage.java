package com.example.bookdoc.pages;

import com.example.bookdoc.pages.uimaps.HomePageUImap;

import static com.example.bookdoc.pages.FullNavigationSideBar.getNavigationSideBar;

public class HomePage {

    private HomePageUImap homePageUImap;
    private FullNavigationSideBar homeNavigationSideBar;

    private HomePage() {
        homePageUImap = new HomePageUImap();
        homeNavigationSideBar = getNavigationSideBar();
    }

    public boolean isHeaderNameEquals(String headerName) {
        if (homePageUImap.getHeaderLabel().equals(headerName)) return true;
        else return false;
    }

    public void clickAdminLoginLink() {
       homeNavigationSideBar.clickAdminLoginLink();
    }

    public void clickDoctorLoginLink() {
        homeNavigationSideBar.clickDoctorLoginLink();
    }

    public void clickPatientLoginLink(){
        homeNavigationSideBar.clickPatientLoginLink();
    };

    public void clickDoctorRegistrationLink() {
        homeNavigationSideBar.clickDoctorRegistrationLink();
    }

    public void clickPatientRegistrationLink(){
        homeNavigationSideBar.clickPatientRegistrationLink();
    };


    public static HomePage getHomePage(){
        return new HomePage();
    }
}
