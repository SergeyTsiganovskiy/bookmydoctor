package com.example.bookdoc.login.doctor;

import com.example.bookdoc.BaseTest;
import com.example.bookdoc.dal.models.DoctorDal;
import com.example.bookdoc.testdata.doctorUI.DoctorUI;
import com.example.bookdoc.testdata.doctorUI.mappers.DoctorUItoDal;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.example.bookdoc.dal.repositories.DoctorRepository.createDoctorInDb;
import static com.example.bookdoc.dal.repositories.DoctorRepository.deleteAllDoctorsInDb;
import static com.example.bookdoc.dal.repositories.DoctorRepository.deleteDoctorById;
import static com.example.bookdoc.pages.DoctorLoginPage.getDoctorLoginPage;
import static com.example.bookdoc.pages.FullNavigationSideBar.getNavigationSideBar;
import static com.example.bookdoc.pages.HomePage.getHomePage;
import static com.example.bookdoc.testdata.doctorUI.DoctorTestData.getValidDoctorUI;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DoctorValidLoginTest extends BaseTest {

    private DoctorUI doctorUI = getValidDoctorUI();
    private DoctorDal doctorDal = DoctorUItoDal.getInstance().map(doctorUI);

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        super.setUp();
        deleteAllDoctorsInDb();
        createDoctorInDb(doctorDal);
    }

    @Test
    public void testDoctorValidLogin() throws Exception {
        getHomePage().clickDoctorLoginLink();
        getDoctorLoginPage().typeId(doctorUI.getId()).typePassword(doctorUI.getPassword()).clickLoginButton();
        assertEquals(getNavigationSideBar().getApproveDoctorsLeaveLinkText(),"VIEW APPOINTMENT HISTORY");

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        super.tearDown();
        deleteDoctorById(doctorDal);
    }
}
