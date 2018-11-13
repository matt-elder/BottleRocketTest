package scenarios;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SubscribeObj;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class BottleRocketsTestCase2 {
    WebDriver driver;
    SubscribeObj subscribeObj;
    String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();


    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseUrl = "http://www.bottlerocketstudios.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl); // TODO: base URL should be configurable, while "/hire-us" should be part of the page object
    }

    @Test(priority = 1)
    public void subScribeTestCase() throws Exception {

        //initiate HireUsForm object
        subscribeObj = new SubscribeObj(driver);

        subscribeObj.selectSubscribePopUp();
        subscribeObj.setFirstName("~!@#$%^&*()_+={}[]\\|';,./<>?");
        subscribeObj.setLastName("~!@#$%^&*()_+={}[]\\|';,./<>?");
        subscribeObj.setEmail("myTest@test.com");
        subscribeObj.setAgreePrivacyPolicy();
        subscribeObj.submitToSubscribe();
    }

    Needed for teardown.
    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {

        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
