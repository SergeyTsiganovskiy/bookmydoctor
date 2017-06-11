package com.example.bookdoc.login.admin;

import com.example.bookdoc.BaseTest;
import com.example.bookdoc.pages.*;
import com.example.bookdoc.testdata.adminUI.AdminUI;
import org.testng.annotations.*;

import static com.example.bookdoc.pages.AdminLoginPage.getAdminLoginPage;
import static com.example.bookdoc.pages.HomePage.getHomePage;
import static com.example.bookdoc.testdata.adminUI.AdminTestData.getValidAdminUI;
import static org.testng.Assert.*;

public class AdminIDIsEmptyTest extends BaseTest {

    private AdminUI adminUI = getValidAdminUI();

    @Test
    public void testAdminIdIsEmpty() throws Exception {

        getHomePage().clickAdminLoginLink();

        getAdminLoginPage().typePassword(adminUI.getPassword()).clickLoginButton();

        assertEquals(new Alert().getAlertText(), "ID field can'nt be left blank");

    }

}
