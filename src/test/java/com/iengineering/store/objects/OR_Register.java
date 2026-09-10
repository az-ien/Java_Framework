package com.iengineering.store.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_Register {

	@CacheLookup
	@FindBy (how = How.ID, using = "AccountInformation_Email")
	public WebElement txtEmailAddress;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "AccountInformation_Password")
	public WebElement txtRegisterPass;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "AccountInformation_ConfirmPassword")
	public WebElement txtRegisterConfirmPass;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "AccountInformation_EmployerType")
	public WebElement cmbEmployer;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "AccountInformation_OccupationType")
	public WebElement cmbOccupation;
	
	@CacheLookup
	@FindBy (how = How.NAME, using = "AccountInformation.EmailFormat")
	public WebElement rdoEmailFormat;
	
	@CacheLookup
	@FindBy (how = How.XPATH, using = "//button[contains(text(),'Next')]")
	public WebElement btnNext;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_NamePrefix")
	public WebElement cmbInitialName;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_FirstName")
	public WebElement txtFirstName;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_MiddleName")
	public WebElement txtMiddleName;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_LastName")
	public WebElement txtLastName;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_OrganizationName")
	public WebElement txtOrganization;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_JobTitle")
	public WebElement txtJobTitle;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_AdressLineOne")
	public WebElement txtAddressLine1;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_AdressLineTwo")
	public WebElement txtAddressLine2;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "my-info-Country")
	public WebElement cmbCountry;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_City")
	public WebElement txtCity;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "my-info-State")
	public WebElement cmbState;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_ZipCode")
	public WebElement txtZip;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_PhoneNo")
	public WebElement txtPhone;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "MyInformation_FaxNo")
	public WebElement txtFax;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "My-Information.Is this your work or home address?")
	public List<WebElement> rdoAddressStatus;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "step2-btn-Next")
	public WebElement btnNext2;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "step2-btn-Cancel")
	public WebElement btnPrevious;
}
