package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SubscribeObj {
    WebDriver driver;

    @FindBy(id = "mat-input-0") // required
            WebElement firstName;

    @FindBy(id = "mat-input-1") // required
            WebElement lastName;

    @FindBy(id = "mat-input-2") // required
            WebElement email;

    @FindBy(id="mat-checkbox-1") //required
            WebElement privacyPolicyAgree;

    @FindBy(className = "subscribe-tab")
            WebElement subscribe;

    @FindBy(id="subscribeFooterSubmit")
            WebElement submit;


    public SubscribeObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectSubscribePopUp(){
        subscribe.click();
    }

    public void setFirstName(String strFirstName) {
        firstName.click();
        firstName.clear();
        firstName.sendKeys(strFirstName);
    }

    public void setLastName(String strFirstName) {
        lastName.click();
        lastName.clear();
        lastName.sendKeys(strFirstName);
    }

    public void setEmail(String strFirstName) {
        email.click();
        email.clear();
        email.sendKeys(strFirstName);
    }

    public void setAgreePrivacyPolicy(){
        privacyPolicyAgree.isSelected();
        privacyPolicyAgree.click();
    }

    public void submitToSubscribe() {
        submit.isEnabled();
        submit.click();
    }


}