package com.example.bookdoc.login.admin;

import com.example.bookdoc.BaseTest;
import com.example.bookdoc.dal.models.AdminDal;
import com.example.bookdoc.testdata.adminUI.AdminUI;
import com.example.bookdoc.testdata.adminUI.mappers.AdminUItoDal;
import org.testng.annotations.*;

import static com.example.bookdoc.dal.repositories.AdminRepository.*;
import static com.example.bookdoc.pages.AdminLoginPage.getAdminLoginPage;
import static com.example.bookdoc.pages.AdminPage.getAdminPage;
import static com.example.bookdoc.pages.HomePage.getHomePage;
import static com.example.bookdoc.testdata.adminUI.AdminTestData.getValidAdminUI;
import static org.testng.Assert.*;


public class AdminValidLoginTest extends BaseTest {

    private AdminUI adminUI = getValidAdminUI();

    @BeforeClass (alwaysRun = true)
    public void setUp() throws Exception {
        super.setUp();
        deleteAllAdminsInDb();
        createAdminInDb(AdminUItoDal.getInstance().map(adminUI));
    }

    @Test
    public void testAdminValidLogin() throws Exception {

        getHomePage().clickAdminLoginLink();

        getAdminLoginPage().typeId(adminUI.getId()).typePassword(adminUI.getPassword()).clickLoginButton();

        assertTrue(getAdminPage().getWelcomFieldText().startsWith("Welcome Admin"));
    }

    @AfterClass (alwaysRun = true)
    public void tearDown() throws Exception {
        super.tearDown();
 //       deleteAdminByIdInDb(adminUI.getId());
    }
}
