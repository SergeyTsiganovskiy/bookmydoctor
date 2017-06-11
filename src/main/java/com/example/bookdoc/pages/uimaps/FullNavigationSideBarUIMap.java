package com.example.bookdoc.pages.uimaps;

import com.example.bookdoc.tools.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FullNavigationSideBarUIMap {

    private WebElement homeLink;
    private WebElement patientRegistrationLink;
    private WebElement doctorRegistrationLink;
    private WebElement patientLoginLink;
    private WebElement doctorLoginLink;
    private WebElement adminLoginLink;
    private WebElement createDoctorLink;
    private WebElement deleteDoctorLink;
    private WebElement deletePatientLink;
    private WebElement logoutLink;
    private WebElement approveDoctorsLeaveLink;
    private WebElement viewPrescriptionLink;

    public WebElement getHomeLink() {
        if (homeLink == null) {
            homeLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='navlist']/li[1]/a"));
        }
        return homeLink;
    }

    public WebElement getPatientRegistrationLink() {
        if (patientRegistrationLink == null) {
            patientRegistrationLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='navlist']/li[2]/a"));
        }
        return patientRegistrationLink;
    }

    public WebElement getDoctorRegistrationLink() {
        if (doctorRegistrationLink == null) {
            doctorRegistrationLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='navlist']/li[3]/a"));
        }
        return doctorRegistrationLink;
    }

    public WebElement getPatientLoginLink() {
        if (patientLoginLink == null) {
            patientLoginLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='leftcolumn']/div/li[1]/a"));
        }
        return patientLoginLink;
    }

    public WebElement getDoctorLoginLink() {
        if (doctorLoginLink == null) {
            doctorLoginLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='leftcolumn']/div/li[2]/a"));
        }
        return doctorLoginLink;
    }

    public WebElement getAdminLoginLink() {
        if (adminLoginLink == null) {
            adminLoginLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='leftcolumn']/div/li[3]/a"));
        }
        return adminLoginLink;
    }

    public WebElement getCreateDoctorLink() {
        if (createDoctorLink == null) {
            createDoctorLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='navlist']/li[2]/a"));
        }
        return createDoctorLink;
    }

    public WebElement getDeleteDoctorLink() {
        if (deleteDoctorLink == null) {
            deleteDoctorLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='navlist']/li[3]/a"));
        }
        return deleteDoctorLink;
    }

    public WebElement getDeletePatientLink() {
        if (deletePatientLink == null) {
            deletePatientLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='navlist']/li[4]/a"));
        }
        return deletePatientLink;
    }

    public WebElement getLogoutLink() {
        if (logoutLink == null) {
            logoutLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='navlist']/li[5]/a"));
        }
        return logoutLink;
    }

    public WebElement getApproveDoctorsLeaveLink() {
        if (approveDoctorsLeaveLink == null) {
            approveDoctorsLeaveLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='navlist']/li[8]/a"));
        }
        return approveDoctorsLeaveLink;
    }

    public WebElement getViewPrescriptionLinkLink() {
        if (viewPrescriptionLink == null) {
            viewPrescriptionLink = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='navlist']/li[5]/a"));
        }
        return viewPrescriptionLink;
    }

}
