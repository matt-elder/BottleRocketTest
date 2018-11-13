package scenarios;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HireUsFormObj;


import static org.testng.Assert.fail;

public class BottleRocketsTestCase1 {
    WebDriver driver;
    HireUsFormObj hireUsFormObj;
    String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    boolean acceptNextAlert = true;


    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseUrl = "http://www.bottlerocketstudios.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.get(baseUrl + "/hire-us");
    }

    @Test(priority = 1)
    public void hireUsFormTestCase1() throws Exception {

        //initiate HireUsForm object
        hireUsFormObj = new HireUsFormObj(driver);

        hireUsFormObj.setFirstName("-<~!@#$%?^&*(),./MaxCharacterTestMaxCharacterTestMaxCharacterTestMaxCharacterTest");
        hireUsFormObj.submitLetsConnect();
        hireUsFormObj.setLastName("-<~!@#$%?^&*(),./");
        hireUsFormObj.submitLetsConnect();
        hireUsFormObj.setCompany("-<~!@#$%?^&*(),./");
        hireUsFormObj.submitLetsConnect();
        hireUsFormObj.setEmail("testing@test.com");
        hireUsFormObj.submitLetsConnect();
        hireUsFormObj.setHearAboutUs("-<~!@#$%?^&*(),./");
        hireUsFormObj.submitLetsConnect();
        hireUsFormObj.setCanWeHelp("-<~!@#$%?^&*(),./");
        hireUsFormObj.setPhone("555-555-5555");
        hireUsFormObj.setCheckedSendNewsLetter();
        hireUsFormObj.submitLetsConnect();
    }

    //Needed for teardown.
    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {

        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}


