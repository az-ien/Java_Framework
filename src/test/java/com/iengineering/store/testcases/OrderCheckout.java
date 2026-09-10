package com.iengineering.store.testcases;

import com.iengineering.store.pages.*;
import com.iengineering.data.XMLDataReader;
import com.iengineering.helper.ApplicationSetup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class OrderCheckout {

	private WebDriver driver;
	private XMLDataReader xmldatareader;
	private Login login;
	private MyAccount myaccount;
    private Publication publication;
    private PublicationDetail publicationdetail;
    private ShoppingCart shopingcart;
    private PaymentInformation paymentinformation;
    private ReviewOrder revieworder;
    private PlaceOrder placeorder;
    

    private String strXmlFile;
    //private String strEnvironment;
    //private String strBrowser;
    //private String strURL;
    
    
    
    @BeforeTest
    
    public void setup()
    {
    	this.xmldatareader = new XMLDataReader();
        this.strXmlFile = "testdata.xml";
        // All classed dependent on driver will be initiated in @Test
    }
    
    @Test
    @Parameters({"Environment","Browser","Project"})
    public void getstarted(@Optional("staging")String strEnvironment, @Optional("Firefox")String strBrowser, @Optional("store")String strProject)
    {
    	ApplicationSetup applicationsetup = new ApplicationSetup(this.driver);
        this.driver = applicationsetup.NavigateApplication(strEnvironment, strBrowser, strProject);
        this.login = new Login(this.driver);
        this.myaccount = new MyAccount(this.driver);
        this.publication = new Publication(this.driver);
        this.publicationdetail = new PublicationDetail(this.driver);
        this.shopingcart = new ShoppingCart(this.driver);
        this.paymentinformation = new PaymentInformation(this.driver);
        this.revieworder = new ReviewOrder(this.driver);
        this.placeorder = new PlaceOrder(this.driver);
        
        
    	this.login.ClickLnkSignin();
    	this.login.TypeUserName(xmldatareader.ReturnXMLNode(strEnvironment, "username", this.strXmlFile,strProject));
    	this.login.TypePassword(xmldatareader.ReturnXMLNode(strEnvironment, "password", this.strXmlFile,strProject));
    	this.login.ClickSignIn();
    	this.myaccount.ClickMnuPublication();
        this.myaccount.ClickMnuEssentialLibrary();
        this.publication.ClickLnkPublication();
        this.publicationdetail.ClickBtnAddtoCart();
        this.publicationdetail.ClickBtnGotoCart();
        this.shopingcart.ClickBtnProceedtoCheckout();
        this.paymentinformation.SelectPaymentMethod("Credit Card");
        this.paymentinformation.SelectCCType("MasterCard");
        this.paymentinformation.TypeInCCName("Zaheer Iqbal");
        this.paymentinformation.TypeInCCNumber("5506900140100305");
        this.paymentinformation.TypeInSecurityCode("1234");
        this.paymentinformation.SelectExpirationMonth("January");
        this.paymentinformation.SelectExpirationYear("2025");
        this.paymentinformation.ClickReviewOrder();
        this.revieworder.ClickBtnPlaceOrdern();
        String strMessage = this.placeorder.MsgSuccess();
        Assert.assertEquals("Thank you for your purchase.", strMessage);
    }
    @AfterTest
    public void teardown()
    {
    	this.driver.quit();
    }
}
