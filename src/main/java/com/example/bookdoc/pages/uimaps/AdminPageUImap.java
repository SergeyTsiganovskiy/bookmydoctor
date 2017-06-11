package com.example.bookdoc.pages.uimaps;

import com.example.bookdoc.tools.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminPageUImap {
    private WebElement header;
    private WebElement welcomeField;
    private WebElement errorMessageField;
    private WebElement createDoctorButton;
    private WebElement deleteDoctorButton;
    private WebElement deleteDoctorInput;
    private WebElement deletePatientButton;
    private WebElement deletePatientInput;
    private WebElement approveLeaveButton;
    private WebElement logoutButton;
    private WebElement generatedPin;



    public WebElement getHeader() {
        if (header == null) {
            header = WebDriverUtils.getDriver().findElement(By.cssSelector("h2"));
        }
        return header;
    }


    public WebElement getWelcomeField() {
        if (welcomeField == null) {
            welcomeField = WebDriverUtils.getDriver().findElement(By.cssSelector("#contentcolumn>ul"));
        }
        return welcomeField;
    }

    public WebElement getlogoutButton() {
        if (logoutButton == null) {
            logoutButton = WebDriverUtils.getDriver().findElement(By.cssSelector("#login"));
        }
        return logoutButton;
    }


    public WebElement getErrorMessageField() {
        if (errorMessageField == null) {
            errorMessageField = WebDriverUtils.getDriver().findElement(By.cssSelector("h2+p"));
        }
        return errorMessageField;
    }

    public WebElement getCreateDoctorButton() {
        if (createDoctorButton == null) {
            createDoctorButton = WebDriverUtils.getDriver().findElement(By.cssSelector("input"));
        }
        return createDoctorButton;
    }

    public WebElement getDeleteDoctorButton() {
        if (deleteDoctorButton == null) {
            deleteDoctorButton = WebDriverUtils.getDriver().findElement(By.xpath("//input[3]"));
        }
        return deleteDoctorButton;
    }

    public WebElement getDeleteDoctorInput() {
        if (deleteDoctorInput == null) {
            deleteDoctorInput = WebDriverUtils.getDriver().findElement(By.xpath("//input[1]"));
        }
        return deleteDoctorInput;
    }

    public WebElement getDeletePatientButton() {
        if (deletePatientButton == null) {
            deletePatientButton = WebDriverUtils.getDriver().findElement(By.xpath("//input[3]"));
        }
        return deletePatientButton;
    }

    public WebElement getDeletePatientInput() {
        if (deletePatientInput == null) {
            deletePatientInput = WebDriverUtils.getDriver().findElement(By.xpath("//input[1]"));
        }
        return deletePatientInput;
    }

    public WebElement getApproveLeaveButton() {
        if (approveLeaveButton == null) {
            approveLeaveButton = WebDriverUtils.getDriver().findElement(By.xpath("//input[1]"));
        }
        return approveLeaveButton;
    }

    public WebElement getGeneratedPin() {
        if (generatedPin == null) {
            generatedPin = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='contentcolumn']/ul/p"));
        }
        return generatedPin;
    }

}
