package com.example.bookdoc.login.admin;

import com.example.bookdoc.BaseTest;
import com.example.bookdoc.testdata.adminUI.AdminUI;
import org.testng.annotations.*;

import static com.example.bookdoc.pages.AdminLoginPage.getAdminLoginPage;
import static com.example.bookdoc.pages.AdminPage.getAdminPage;
import static com.example.bookdoc.pages.HomePage.getHomePage;
import static com.example.bookdoc.testdata.adminUI.AdminTestData.getInValidAdminUIById;
import static org.testng.Assert.*;

public class AdminIDIsIncorrectTest extends BaseTest {

    private AdminUI adminUI = getInValidAdminUIById();

    @Test
    public void testAdminIdIsIncorrect() throws Exception {

        getHomePage().clickAdminLoginLink();

        getAdminLoginPage().typeId(adminUI.getId()).typePassword(adminUI.getPassword()).clickLoginButton();

        assertEquals(getAdminPage().getErrorMessageText(), "Invalid Login   Credentials");
    }
}