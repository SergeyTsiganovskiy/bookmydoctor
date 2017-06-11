package com.example.bookdoc.pages.uimaps;

import com.example.bookdoc.tools.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DoctorLoginPageUImap {
    WebElement newId;
    WebElement userId;
    WebElement password;
    WebElement login;

    public WebElement getNewId() {
        if (newId == null) {
            newId = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='newId']"));
        }
        return newId;
    }

    public WebElement getUserId() {
        if (userId == null) {
            userId = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='contentcolumn']/form/label[1]/input"));
        }
        return userId;
    }

    public WebElement getPassword() {
        if (password == null) {
            password = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='contentcolumn']/form/label[2]/input"));
        }
        return password;
    }

    public WebElement getLogin() {
        if (login == null) {
            login = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='login']"));
        }
        return login;
    }
}
