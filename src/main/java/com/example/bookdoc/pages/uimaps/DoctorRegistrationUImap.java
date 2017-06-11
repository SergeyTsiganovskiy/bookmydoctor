package com.example.bookdoc.pages.uimaps;

import com.example.bookdoc.tools.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DoctorRegistrationUImap {

    WebElement headerLabel ;
    WebElement pinInput ;
    WebElement passwordInput ;
    WebElement nameInput ;
    WebElement typeEntCheckbox;
    WebElement typeDentistCheckbox;
    WebElement typePathologyCheckbox;
    WebElement typeDermatologistCheckbox;
    WebElement typePsycisianCheckbox;

    WebElement ageInput;
    WebElement registerButton ;

    public WebElement getHeaderLabel() {
        if (headerLabel == null) {
            headerLabel = WebDriverUtils.getDriver().findElement(By.cssSelector("h2"));
        }
        return headerLabel;
    }

    public WebElement getPinInput() {
        if (pinInput == null) {
            pinInput = WebDriverUtils.getDriver().findElement(By.cssSelector("#pin"));
        }
        return pinInput;
    }

    public WebElement getPasswordInput() {
        if (passwordInput == null) {
            passwordInput = WebDriverUtils.getDriver().findElement(By.cssSelector("#password"));
        }
        return passwordInput;
    }

    public WebElement getNameInput() {
        if (nameInput == null) {
            nameInput = WebDriverUtils.getDriver().findElement(By.cssSelector("#name"));
        }
        return nameInput;
    }

    public WebElement getTypeEntCheckbox() {
        if (typeEntCheckbox == null) {
            typeEntCheckbox = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@value='ENT']"));
        }
        return typeEntCheckbox;
    }

    public WebElement getTypeDentistCheckbox() {
        if (typeDentistCheckbox == null) {
            typeDentistCheckbox = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@value='Dentist']"));
        }
        return typeDentistCheckbox;
    }

    public WebElement getTypePathologyCheckbox() {
        if (typePathologyCheckbox == null) {
            typePathologyCheckbox = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@value='Pathology']"));
        }
        return typePathologyCheckbox;
    }

    public WebElement getTypeDermatologistCheckbox() {
        if (typeDermatologistCheckbox == null) {
            typeDermatologistCheckbox = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@value='Dermatologist']"));
        }
        return typeDermatologistCheckbox;
    }

    public WebElement getTypePsycisianCheckbox() {
        if (typePsycisianCheckbox == null) {
            typePsycisianCheckbox = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@value='Physician']"));
        }
        return typePsycisianCheckbox;
    }


    public WebElement getAgeInput() {
        if (ageInput == null) {
            ageInput = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@id='age']"));
        }
        return ageInput;
    }


    public WebElement getRegisterButton() {
        if (registerButton == null) {
            registerButton = WebDriverUtils.getDriver().findElement(By.xpath(".//*[@value='Register']"));
        }
        return registerButton;
    }

}
