package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_MyAccount {

	@CacheLookup
	@FindBy (how = How.LINK_TEXT, using = "Publications")
	public WebElement mnuPublication;
	
	@CacheLookup
	@FindBy (how = How.XPATH, using = "//div[@id='navbar']/div/ul/li/div/div/div[2]/div/div/a/div/div[2]/span")
	public WebElement mnuEssentialLibrary;
	
	@CacheLookup
	@FindBy (how = How.LINK_TEXT,using = "Update Profile")
	public WebElement lnkUpdateProfile;
	
	@CacheLookup
	@FindBy (how = How.LINK_TEXT,using = "Change Email Address")
	public WebElement lnkChangeEmailAddress;
	
	@CacheLookup
	@FindBy (how = How.LINK_TEXT,using = "Change Password")
	public WebElement lnkChangePassword;
	
	@CacheLookup
	@FindBy (how = How.LINK_TEXT,using = "Change Digital Password")
	public WebElement lnkChangeDigitalPassword;
	
	@CacheLookup
	@FindBy (how = How.LINK_TEXT,using = "Get Security Plug-In")
	public WebElement lnkGetSecurityPlugIn;
	
	@CacheLookup
	@FindBy (how = How.LINK_TEXT,using = "Subscription Opt-Out")
	public WebElement lnkSubscriptionOptOut;
	
	@CacheLookup
	@FindBy (how = How.LINK_TEXT,using = "Cancel AASHTO Account")
	public WebElement lnkCancelAASHTOAccount;
}
