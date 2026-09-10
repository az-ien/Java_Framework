package com.iengineering.store.pages;

import com.iengineering.store.objects.OR_MyAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.iengineering.helper.CommonMethods;

public class MyAccount {

	private final WebDriver driver;
	OR_MyAccount ormyaccount;
	
	public MyAccount(WebDriver driver)
	{
		this.driver = driver;
		this.ormyaccount = PageFactory.initElements(this.driver, OR_MyAccount.class);
	}
	
	public void ClickMnuPublication()
	{
		CommonMethods.ClickLink(this.driver, ormyaccount.mnuPublication);
	}
	
	public void ClickMnuEssentialLibrary()
	{
		CommonMethods.ClickLink(this.driver, this.ormyaccount.mnuEssentialLibrary);
	}
	
	public boolean isUpdateProfilePresent()
	{
		return CommonMethods.isElementPresent(this.driver, this.ormyaccount.lnkUpdateProfile);
	}
	
	public boolean isChangeEmailAddressPresent()
	{
		return CommonMethods.isElementPresent(this.driver, this.ormyaccount.lnkChangeEmailAddress);
	}
	
	public boolean isChangePasswordPresent()
	{
		return CommonMethods.isElementPresent(this.driver, this.ormyaccount.lnkChangePassword);
	}
	
	public boolean isChangeDigitalPasswordPresent()
	{
		return CommonMethods.isElementPresent(this.driver, this.ormyaccount.lnkChangeDigitalPassword);
	}
	
	public boolean isGetSecurityPlugInPresent()
	{
		return CommonMethods.isElementPresent(this.driver, this.ormyaccount.lnkGetSecurityPlugIn);
	}
	
	public boolean isSubscriptionOptOutPresent()
	{
		return CommonMethods.isElementPresent(this.driver, this.ormyaccount.lnkSubscriptionOptOut);
	}
	
	public boolean isCancelAASHTOAccountPresent()
	{
		return CommonMethods.isElementPresent(this.driver, this.ormyaccount.lnkCancelAASHTOAccount);
	}
}
