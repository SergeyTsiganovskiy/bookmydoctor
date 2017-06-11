package com.example.bookdoc.pages.uimaps;

import com.example.bookdoc.tools.WebDriverUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

public class AlertUIMap {

    private Alert alert;

    public Alert getAlert() {
        try {
            // Check the presence of alert
            alert = WebDriverUtils.getDriver().switchTo().alert();
         } catch (NoAlertPresentException ex) {
            // Alert not present
            ex.printStackTrace();
        }
        return alert;
    }
}
