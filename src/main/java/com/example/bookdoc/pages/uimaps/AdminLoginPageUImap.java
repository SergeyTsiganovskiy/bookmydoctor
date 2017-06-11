package com.example.bookdoc.pages.uimaps;

import com.example.bookdoc.tools.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminLoginPageUImap {

    private WebElement userIdInput;
    private WebElement passwordInput;
    private WebElement loginButton;

    public WebElement getUserIdInput() {
        if (userIdInput == null) {
            userIdInput = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='contentcolumn']/form/label[1]/input"));
        }
        return userIdInput;
    }

    public WebElement getPasswordInput() {
        if (passwordInput == null) {
            passwordInput = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='contentcolumn']/form/label[2]/input"));
        }
        return passwordInput;
    }

    public WebElement getLoginButton() {
        if (loginButton == null) {
            loginButton = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='login  ']"));
        }
        return loginButton;
    }

}
