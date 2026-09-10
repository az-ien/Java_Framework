package com.iengineering.store.testcases.authentication;

import com.iengineering.data.XMLDataReader;
import com.iengineering.helper.ApplicationSetup;
import com.iengineering.store.pages.Login;
import com.iengineering.store.pages.MyAccount;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class InvalidCredentails {
    private WebDriver driver;
    private XMLDataReader xmldatareader;
    private String strXmlFile;

    @BeforeTest

    public void setup() {
        this.xmldatareader = new XMLDataReader();
        this.strXmlFile = "testdata.xml";
        // All classed dependent on driver will be initiated in @Test
    }
    @Test
    @Parameters({"Environment", "Browser", "Project"})
    public void getstarted(@Optional("staging") String strEnvironment, @Optional("Firefox") String strBrowser, @Optional("store") String strProject) {
        ApplicationSetup applicationsetup = new ApplicationSetup(this.driver);
        this.driver = applicationsetup.NavigateApplication(strEnvironment, strBrowser, strProject);
        Login login = new Login(this.driver);

        login.ClickLnkSignin();
        login.TypeUserName("abc@test.com");
        login.TypePassword("abcd123");
        login.ClickSignIn();

        Assert.assertTrue(login.isErrorNotificationPresent());
    }

    @AfterTest
    public void teardown() {
        this.driver.quit();
    }

}
