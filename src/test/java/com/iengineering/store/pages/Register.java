package com.iengineering.store.pages;

import com.iengineering.store.objects.OR_Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.iengineering.helper.CommonMethods;

public class Register {

	private final WebDriver driver;
	private final OR_Register orregister;

	public Register(WebDriver driver)
	{
		this.driver = driver;
		this.orregister = PageFactory.initElements(this.driver, OR_Register.class);
	}
	
	 public void TypeEmailAddress(String txtEmailAddress)
     {
		 CommonMethods.TypeInWebElement(this.driver, this.orregister.txtEmailAddress, txtEmailAddress);
     }

     public void TypeRegisterPass(String txtRegisterPass)
     {
    	 CommonMethods.TypeInWebElement(this.driver, this.orregister.txtRegisterPass, txtRegisterPass);
     }

     public void TypeRegisterConfirmPass(String txtRegisterConfirmPass)
     {
    	 CommonMethods.TypeInWebElement(driver, this.orregister.txtRegisterConfirmPass, txtRegisterConfirmPass);
     }

     public void SelectEmployer(String strEmployer)
     {
         CommonMethods.SelectComboValue(driver, this.orregister.cmbEmployer, strEmployer);
     }

     public void SelectOccupation(String strOccupation)
     {
         CommonMethods.SelectComboValue(driver, this.orregister.cmbOccupation, strOccupation);
     }

     public void ClickNext()
     {
         CommonMethods.ClickButton(driver, this.orregister.btnNext);
     }

     public void SelectInitialName(int intVal)
     {
         CommonMethods.SelectComboValue(driver, this.orregister.cmbInitialName, intVal);
     }

     public void TypeFirstName(String txtFirstName)
     {
         CommonMethods.TypeInWebElement(driver, this.orregister.txtFirstName, txtFirstName);
     }
     
     public void TypeMiddleName(String txtMiddleName)
     {
         CommonMethods.TypeInWebElement(driver, this.orregister.txtMiddleName, txtMiddleName);
     }
     
     public void TypeLastName(String txtLastName)
     {
         CommonMethods.TypeInWebElement(driver, this.orregister.txtLastName, txtLastName);
     }
     
     public void TypeOrganization(String txtOrganization)
     {
         CommonMethods.TypeInWebElement(driver, this.orregister.txtOrganization, txtOrganization);
     }
     
     public void TypeJobTitle(String txtJobTitle)
     {
         CommonMethods.TypeInWebElement(driver, this.orregister.txtJobTitle, txtJobTitle);
     }
     
     public void TypeAddress1(String txtAddress1)
     {
         CommonMethods.TypeInWebElement(driver, this.orregister.txtAddressLine1, txtAddress1);
     }
     
     public void SelectCountry(String txtCountry)
     {
         CommonMethods.SelectComboValue(driver, this.orregister.cmbCountry, txtCountry);
     }
     
     public void TypeCity(String txtCity)
     {
         CommonMethods.TypeInWebElement(driver, this.orregister.txtCity, txtCity);
     }
     
     public void SelectState(String txtState)
     {
         CommonMethods.SelectComboValue(driver, this.orregister.cmbState, txtState);
     }
     
     public void TypeZipCode(String txtZipCode)
     {
         CommonMethods.TypeInWebElement(driver, this.orregister.txtZip, txtZipCode);
     }
     
     public void TypePhone(String txtPhone)
     {
         CommonMethods.TypeInWebElement(driver, this.orregister.txtPhone, txtPhone);
     }
     
     public void TypeFax(String txtFax)
     {
         CommonMethods.TypeInWebElement(driver, this.orregister.txtFax, txtFax);
     }
}
