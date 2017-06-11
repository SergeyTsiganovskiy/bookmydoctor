package com.example.bookdoc.tools;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverUtils {
    private static final long IMPLICITLY_WAIT_TIMEOUT = 10;
    private static WebDriver driver;

    private WebDriverUtils() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(getImplicitlyWaitTimeout(), TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    static long getImplicitlyWaitTimeout() {
        return IMPLICITLY_WAIT_TIMEOUT;
    }

    public static void load(final String path) {
        getDriver().navigate().to(path);
    }

    public static void stop() {
        if (driver != null) {
            try {
                driver.close();
            } catch (UnhandledAlertException e) {
                String errorMesseme = e.getMessage();
                while (!errorMesseme.equals("")) {
                    try {
                        driver.close();
                        errorMesseme = "";
                    } catch (UnhandledAlertException e1) {
                        errorMesseme = e1.getMessage();
                    }
                }
                driver = null;
                throw new UnhandledAlertException(e.getMessage());
            }
        }
        driver = null;
     }

    public static String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    public static String getTitle() {
        return getDriver().getTitle();
    }

    public static void switchToNewWindow() {
        java.util.Set<String> handles = driver.getWindowHandles();
        for (String handle1 : driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
            driver.manage().window().maximize();

        }
    }
}
