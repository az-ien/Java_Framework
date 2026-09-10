package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_PaymentInformation {

	@CacheLookup
	@FindBy (how = How.ID, using = "PAYMENT_METHOD")
	public WebElement cmbPaymentMethod;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "CREDIT_CARD_TYPE")
	public WebElement cmbCreditCardType;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "CREDIT_CARD_NAME")
	public WebElement txtCCName;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "CREDIT_CARD_NUMBER")
	public WebElement txtCCNumber;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "CREDIT_CARD_SECURITY_CODE")
	public WebElement txtSecurityCode;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "CREDIT_CARD_EXPIRATION_MONTH")
	public WebElement cmbExpiryMonth;
	
	@CacheLookup
	@FindBy (how = How.XPATH, using = "//div[@id='collapseThree']/div/div[2]/div[5]/div[2]/select")
	public WebElement cmbExpiryYear;
	
	@CacheLookup
	@FindBy (how = How.XPATH, using = "//button[contains(text(),'Review Order')]")
	public WebElement btnReviewOrder;
}
