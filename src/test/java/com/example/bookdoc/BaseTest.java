package com.example.bookdoc;

import com.example.bookdoc.tools.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.AssertJUnit.fail;

public class BaseTest {
    private String baseUrl = "http://localhost:8080/";

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        WebDriverUtils.load(baseUrl + "BookMyDoc/");
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        WebDriverUtils.stop();
    }
}
