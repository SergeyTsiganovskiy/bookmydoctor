package com.example.bookdoc.pages.uimaps;

import com.example.bookdoc.tools.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageUImap {
    private WebElement headerLabel;

    public WebElement getHeaderLabel() {
        if (headerLabel == null) {
            headerLabel = WebDriverUtils.getDriver().findElement(By.cssSelector("h2"));
        }
        return headerLabel;
    }
}
