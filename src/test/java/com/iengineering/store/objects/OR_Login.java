package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_Login {

	@CacheLookup
	@FindBy (how = How.ID, using = "accountLoginEmail")
	public WebElement txtLogin;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "accountLoginPassword")
	public WebElement txtPassword;
	
	@CacheLookup
	@FindBy (how = How.XPATH, using = "//button[contains(text(),'Sign In')]")
	public WebElement btnSignIn;
	
	@CacheLookup
	@FindBy (how = How.XPATH, using = "//*[@id='accountloginForm']/div[5]/div/button[2]")
	public WebElement btnCancel;
	
	@CacheLookup
	@FindBy (how = How.XPATH, using = "//div[contains(text(),'Sign in or Register')]")
	public WebElement lnkSignIn;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "loginEmail")
	public WebElement txtLoginEmail;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "loginPassword")
	public WebElement txtLoginPassword;
	
	@CacheLookup
	@FindBy (how = How.XPATH, using = "//a[contains(text(),'Forgot your password?')]")
	public WebElement lnkForgotPassword;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "loginRemember")
	public WebElement chkLoginRemember;
	
	@CacheLookup
	@FindBy (how = How.XPATH, using = "//div[@class='col-12 button-grid']//button[@type='submit'][contains(text(),'Register')]")
	public WebElement txtRegisterEmail;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "registerEmail")
	public WebElement btnRegister;

	@FindBy (how = How.XPATH, using = "//a[@class='p-0'][1]")
	public WebElement msgError;
	
}
