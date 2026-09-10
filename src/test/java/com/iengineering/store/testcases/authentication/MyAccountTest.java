package com.iengineering.store.testcases.authentication;

import com.iengineering.data.XMLDataReader;
import com.iengineering.helper.ApplicationSetup;
import com.iengineering.store.pages.Login;
import com.iengineering.store.pages.MyAccount;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class MyAccountTest {

    private WebDriver driver;
    private XMLDataReader xmldatareader;
    private MyAccount myaccount;
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
        this.myaccount = new MyAccount(this.driver);

        login.ClickLnkSignin();
        login.TypeUserName(xmldatareader.ReturnXMLNode(strEnvironment, "username", this.strXmlFile, strProject));
        login.TypePassword(xmldatareader.ReturnXMLNode(strEnvironment, "password", this.strXmlFile, strProject));
        login.ClickSignIn();

        //Assert.assertEquals(this.myaccount.isUpdateProfilePresent(), True);
        Assert.assertTrue(this.myaccount.isUpdateProfilePresent());
        Assert.assertTrue(this.myaccount.isChangeEmailAddressPresent());
        Assert.assertFalse(this.myaccount.isChangeEmailAddressPresent());
    }

    @Test
    public void getstarted1() {
        this.myaccount = new MyAccount(this.driver);
        Assert.assertTrue(this.myaccount.isChangeEmailAddressPresent());
    }

    @AfterTest
    public void teardown() {
        this.driver.quit();
    }
}
