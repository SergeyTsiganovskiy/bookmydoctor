package com.example.bookdoc.registration.doctor;


import com.example.bookdoc.BaseTest;
import com.example.bookdoc.dal.models.DoctorDal;
import com.example.bookdoc.dal.repositories.DoctorRepository;
import com.example.bookdoc.testdata.doctorUI.DoctorUI;
import com.example.bookdoc.testdata.doctorUI.mappers.DoctorDaltoUI;
import com.example.bookdoc.testdata.doctorUI.mappers.DoctorUItoDal;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.example.bookdoc.dal.repositories.DoctorRepository.createDoctorInDb;
import static com.example.bookdoc.dal.repositories.DoctorRepository.deleteAllDoctorsInDb;
import static com.example.bookdoc.dal.repositories.DoctorRepository.deleteDoctorById;
import static com.example.bookdoc.pages.AdminPage.getAdminPage;
import static com.example.bookdoc.pages.DoctorLoginPage.getDoctorLoginPage;
import static com.example.bookdoc.pages.DoctorRegistrationPage.getDoctorRegistrationPage;
import static com.example.bookdoc.pages.FullNavigationSideBar.getNavigationSideBar;
import static com.example.bookdoc.pages.HomePage.getHomePage;
import static com.example.bookdoc.testdata.doctorUI.DoctorTestData.getDoctorUIForRegistration;
import static com.example.bookdoc.testdata.doctorUI.DoctorTestData.getValidDoctorUI;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DoctorValidRegistration extends BaseTest{

    private DoctorUI doctorUI;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        super.setUp();
        deleteAllDoctorsInDb();
        doctorUI = getDoctorUIForRegistration();
        getNavigationSideBar().clickHomeLink();
        getNavigationSideBar().clickLogOutLink();
        getAdminPage().clickLogOutLink();
    }

    @Test
    public void testDoctorValidLogin() throws Exception {

        getHomePage().clickDoctorRegistrationLink();
        getDoctorRegistrationPage()
                .typePin(doctorUI.getPin())
                .typePassword(doctorUI.getPassword())
                .typeName(doctorUI.getName())
                .checkDoctorsType(doctorUI.getSpeciality())
                .typeAge(doctorUI.getAge())
                .clickRegisterButton();

        DoctorDal doctorDalRegistrated = DoctorRepository.getAllDoctor();

        DoctorUI doctorUIRegistrated = DoctorDaltoUI.getInstance().map(doctorDalRegistrated);

        System.out.println(doctorUIRegistrated.getId());
        System.out.println(doctorUIRegistrated.getPassword());
        System.out.println(doctorUIRegistrated.getName());
        System.out.println(doctorUIRegistrated.getAge());
        System.out.println(doctorUIRegistrated.getSpeciality());
        System.out.println(doctorUIRegistrated.getPin());

        assertTrue(doctorUI.equals(doctorUIRegistrated));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
