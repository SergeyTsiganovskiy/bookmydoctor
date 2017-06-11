package com.example.bookdoc.login.admin;

import com.example.bookdoc.BaseTest;
import com.example.bookdoc.dal.models.AdminDal;
import com.example.bookdoc.testdata.adminUI.AdminUI;
import com.example.bookdoc.testdata.adminUI.mappers.AdminUItoDal;
import org.testng.annotations.*;

import static com.example.bookdoc.dal.repositories.AdminRepository.createAdminInDb;
import static com.example.bookdoc.dal.repositories.AdminRepository.deleteAdminByIdInDb;
import static com.example.bookdoc.dal.repositories.AdminRepository.deleteAllAdminsInDb;
import static com.example.bookdoc.pages.AdminLoginPage.getAdminLoginPage;
import static com.example.bookdoc.pages.AdminPage.getAdminPage;
import static com.example.bookdoc.pages.HomePage.getHomePage;
import static com.example.bookdoc.testdata.adminUI.AdminTestData.getInValidAdminUIByPassword;
import static com.example.bookdoc.testdata.adminUI.AdminTestData.getValidAdminUI;
import static org.testng.Assert.*;

public class AdminPasswordIsIncorrectTest extends BaseTest {

    private AdminUI adminUI = getValidAdminUI();
    private AdminUI inValidByPasswordAdminUI = getInValidAdminUIByPassword();

    @BeforeClass (alwaysRun = true)
    public void setUp() throws Exception {
        super.setUp();
        deleteAllAdminsInDb();
        createAdminInDb(AdminUItoDal.getInstance().map(adminUI));
    }

    @Test
    public void testAllFieldsValidInput() throws Exception {

        getHomePage().clickAdminLoginLink();

        getAdminLoginPage().typeId(adminUI.getId())
                .typePassword(inValidByPasswordAdminUI
                        .getPassword()).clickLoginButton();

        assertEquals(getAdminPage().getErrorMessageText(), "Invalid Login   Credentials");
    }

    @AfterClass (alwaysRun = true)
    public void tearDown() throws Exception {
        super.tearDown();
        deleteAdminByIdInDb(adminUI.getId());
    }
}