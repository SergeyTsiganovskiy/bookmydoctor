package com.example.bookdoc.login.patient;

import com.example.bookdoc.BaseTest;
import com.example.bookdoc.dal.models.PatientDal;
import com.example.bookdoc.testdata.patientUI.PatientUI;
import com.example.bookdoc.testdata.patientUI.mappers.PatientUItoDal;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static com.example.bookdoc.dal.repositories.PatientRepository.createPatientInDb;
import static com.example.bookdoc.dal.repositories.PatientRepository.deleteAllPatientsInDb;
import static com.example.bookdoc.dal.repositories.PatientRepository.deletePatientById;
import static com.example.bookdoc.pages.FullNavigationSideBar.getNavigationSideBar;
import static com.example.bookdoc.pages.HomePage.getHomePage;
import static com.example.bookdoc.pages.PatientLoginPage.getPatientLoginPage;
import static com.example.bookdoc.testdata.patientUI.PatientTestData.getValidPatientUI;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PatientValidLoginTest extends BaseTest {

    private PatientUI patientUI = getValidPatientUI();
    private PatientDal patientDal = PatientUItoDal.getInstance().map(patientUI);

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        super.setUp();
        deleteAllPatientsInDb();
        createPatientInDb(patientDal);
    }

    @Test
    public void testPatientValidLogin() throws Exception {
        getHomePage().clickPatientLoginLink();
        getPatientLoginPage().typeId(patientUI.getId()).typePassword(patientUI.getPassword()).clickLoginButton();
        assertEquals(getNavigationSideBar().getViewPrescriptionLinkText(), "VIEW PRESCRIPTION");

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        super.tearDown();
        deletePatientById(patientDal);
    }
}