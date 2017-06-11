package com.example.bookdoc.pages;

import com.example.bookdoc.pages.uimaps.DoctorRegistrationUImap;
import com.example.bookdoc.testdata.doctorUI.DoctorType;

public class DoctorRegistrationPage {
    private DoctorRegistrationUImap doctorRegistrationUImap;

    private DoctorRegistrationPage() {
        doctorRegistrationUImap = new DoctorRegistrationUImap();
    }

    public DoctorRegistrationPage typePin (String pin){
        doctorRegistrationUImap.getPinInput().sendKeys(pin);
        return this;
    }
    public DoctorRegistrationPage typePassword (String password){
        doctorRegistrationUImap.getPasswordInput().sendKeys(password);
        return this;
    }
    public DoctorRegistrationPage typeName (String name){
        doctorRegistrationUImap.getNameInput().sendKeys(name);
        return this;
    }
    public DoctorRegistrationPage checkDoctorsType (DoctorType type) {
        switch (type) {
            case ENT: doctorRegistrationUImap.getTypeEntCheckbox().click(); break;
            case DENTIST: doctorRegistrationUImap.getTypeDentistCheckbox().click(); break;
            case PATHOLOGY: doctorRegistrationUImap.getTypePathologyCheckbox().click(); break;
            case DERMATOLOGIST: doctorRegistrationUImap.getTypeDermatologistCheckbox().click(); break;
            case PHYSICIAN: doctorRegistrationUImap.getTypePsycisianCheckbox().click(); break;
        }
        return this;
    }
    public  DoctorRegistrationPage typeAge(String age){
        doctorRegistrationUImap.getAgeInput().sendKeys(age);
        return this;
    }
    public DoctorLoginPage clickRegisterButton(){
        doctorRegistrationUImap.getRegisterButton().click();
        return DoctorLoginPage.getDoctorLoginPage();
    }

    public static DoctorRegistrationPage getDoctorRegistrationPage(){
        return new DoctorRegistrationPage();
    }
}
