package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HireUsFormObj {
    WebDriver driver;

    @FindBy(id = "mat-input-0") // required
            WebElement firstName;

    @FindBy(id = "mat-input-1") // required
            WebElement lastName;

    @FindBy(id = "mat-input-2") // optional
            WebElement company;

    @FindBy(id = "mat-input-3") // required
            WebElement phone;

    @FindBy(id = "mat-input-4") // required
            WebElement email;

    @FindBy(id = "mat-input-5") // required
            WebElement hearAboutUs;

    @FindBy(id = "mat-input-6") // required
            WebElement canWeHelp;

    @FindBy(id = "mat-checkbox-1") // required
            WebElement newsLetterCheckbox;



     @FindBy(id = "contactSubmit")
    WebElement submitButton;


    public HireUsFormObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String strFirstName) {
        firstName.click();
        firstName.clear();
        firstName.sendKeys(strFirstName);
    }

    public void setLastName(String strLastName) {
        lastName.click();
        lastName.clear();
        lastName.sendKeys(strLastName);
    }

    public void setCompany(String strCompany) {
        company.click();
        company.clear();
        company.sendKeys(strCompany);
    }

    public void setPhone(String strPhone) {
        phone.click();
        phone.clear();
        phone.sendKeys(strPhone);
    }


    public void setEmail(String strState) {
        email.click();
        email.clear();
        email.sendKeys(strState);
    }

    public void setCanWeHelp(String strCanWeHelp) {
        canWeHelp.click();
        canWeHelp.clear();
        canWeHelp.sendKeys(strCanWeHelp);
    }

    public void setHearAboutUs(String strHearAboutUs) {
        hearAboutUs.click();
        hearAboutUs.clear();
        hearAboutUs.sendKeys(strHearAboutUs);
    }

    public void setCheckedSendNewsLetter(){
        newsLetterCheckbox.isSelected();
        newsLetterCheckbox.click();
    }


    public void submitLetsConnect() {
        submitButton.isEnabled();
        submitButton.click();
    }


}

