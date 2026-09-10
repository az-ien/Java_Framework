package com.iengineering.store.pages;


import com.iengineering.store.objects.OR_Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.iengineering.helper.CommonMethods;


public class Login {

	private final WebDriver driver;
	OR_Login orlogin;
		
	public Login(WebDriver driver)
	{
		this.driver = driver;
		this.orlogin = PageFactory.initElements(this.driver, OR_Login.class);
	}
	
	public void ClickLnkSignin()
	{
		CommonMethods.ClickLink(this.driver, this.orlogin.lnkSignIn);
	}
	
	public void TypeUserName(String txtusername) {
		CommonMethods.TypeInWebElement(this.driver, this.orlogin.txtLoginEmail,txtusername);
	}
	
	
	public void TypePassword(String txtpassword)
	{
		CommonMethods.TypeInWebElement(driver, this.orlogin.txtLoginPassword, txtpassword);
	}
	
	public void ClickSignIn()
	{
		CommonMethods.ClickButton(driver, this.orlogin.btnSignIn);
	}
	
	public void ClickCancel()
	{
		CommonMethods.ClickButton(driver, this.orlogin.btnCancel);
	}
	
	public void TypeRegisterEmail(String txtregisteremail)
	{
		CommonMethods.TypeInWebElement(driver, this.orlogin.txtRegisterEmail, txtregisteremail);
	}
	
	public void ClickRegister()
	{
		CommonMethods.ClickButton(driver, this.orlogin.btnRegister);
	}
	public boolean isErrorNotificationPresent()
	{
		return CommonMethods.isElementPresent(driver,this.orlogin.msgError);
	}
}

