package com.example.bookdoc.login.admin;

        import com.example.bookdoc.BaseTest;
        import com.example.bookdoc.testdata.adminUI.AdminUI;
        import org.testng.annotations.*;

        import static com.example.bookdoc.pages.AdminLoginPage.getAdminLoginPage;
        import static com.example.bookdoc.pages.AdminPage.getAdminPage;
        import static com.example.bookdoc.pages.HomePage.getHomePage;
        import static com.example.bookdoc.testdata.adminUI.AdminTestData.getValidAdminUI;
        import static org.testng.Assert.*;

public class AdminPasswordIsEmptyTest extends BaseTest {

    private AdminUI adminUI = getValidAdminUI();

    @Test
    public void testAdminPasswordIsIncorrect() throws Exception {

        getHomePage().clickAdminLoginLink();

        getAdminLoginPage().typeId(adminUI.getId()).clickLoginButton();

        assertEquals(getAdminPage().getErrorMessageText(), "Invalid Login   Credentials");
    }
}
