package com.example.bookdoc.testdata.doctorUI;

import com.example.bookdoc.pages.AdminPage;
import com.example.bookdoc.testdata.adminUI.AdminUI;
import com.example.bookdoc.testdata.adminUI.mappers.AdminUItoDal;

import java.sql.SQLException;

import static com.example.bookdoc.dal.repositories.AdminRepository.createAdminInDb;
import static com.example.bookdoc.dal.repositories.AdminRepository.deleteAllAdminsInDb;
import static com.example.bookdoc.pages.AdminLoginPage.getAdminLoginPage;
import static com.example.bookdoc.pages.AdminPage.getAdminPage;
import static com.example.bookdoc.pages.FullNavigationSideBar.getNavigationSideBar;
import static com.example.bookdoc.pages.HomePage.getHomePage;
import static com.example.bookdoc.testdata.adminUI.AdminTestData.getValidAdminUI;
import static org.testng.Assert.assertTrue;

public class DoctorTestData {
    public static DoctorUI getValidDoctorUI(){
        return new DoctorUI.DoctorUIBuilder()
                .Id("1")
                .Password("docpass")
                .Name("docname")
                .Age("45")
                .Speciality(DoctorType.DENTIST)
                .Pin("1234").build();
    }

    public static DoctorUI getDoctorUIForRegistration() throws SQLException, ClassNotFoundException {
        String pin;
        deleteAllAdminsInDb();
        AdminUI adminUI = getValidAdminUI();
        createAdminInDb(AdminUItoDal.getInstance().map(adminUI));
        getHomePage().clickAdminLoginLink();
        getAdminLoginPage().typeId(adminUI.getId()).typePassword(adminUI.getPassword()).clickLoginButton();
        if(getAdminPage().getWelcomFieldText().startsWith("Welcome Admin")){
            getNavigationSideBar().clickCreateDoctorLink();
        }

        AdminPage adminPage = getAdminPage();
        adminPage.clickCreateDoctorButton();
        pin = adminPage.getGeneratedPin();

        return new DoctorUI.DoctorUIBuilder()
                .Id("")
                .Password("docpass")
                .Name("docname")
                .Age("45")
                .Speciality(DoctorType.DENTIST)
                .Pin(pin).build();
    }
}
