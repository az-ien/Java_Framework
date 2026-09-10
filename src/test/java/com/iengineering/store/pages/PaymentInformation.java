package com.iengineering.store.pages;

import com.iengineering.store.objects.OR_PaymentInformation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.iengineering.helper.CommonMethods;

public class PaymentInformation {
	
	private final WebDriver driver;
	private final OR_PaymentInformation orpaymentinformation;

	public PaymentInformation(WebDriver driver)
	{
		this.driver = driver;
		this.orpaymentinformation = PageFactory.initElements(this.driver, OR_PaymentInformation.class);
	}
	
	public void SelectPaymentMethod(String strValue)
    {
        CommonMethods.SelectComboValue(this.driver, this.orpaymentinformation.cmbPaymentMethod, strValue);
    }
	
	public void SelectCCType(String strValue)
    {
        CommonMethods.SelectComboValue(this.driver, this.orpaymentinformation.cmbCreditCardType, strValue);
    }
	
	public void TypeInCCName(String strValue)
    {
        CommonMethods.TypeInWebElement(this.driver, this.orpaymentinformation.txtCCName, strValue);
    }
	
	public void TypeInCCNumber(String strValue)
    {
        CommonMethods.TypeInWebElement(this.driver, this.orpaymentinformation.txtCCNumber, strValue);
    }
	
	public void TypeInSecurityCode(String strValue)
    {
        CommonMethods.TypeInWebElement(this.driver, this.orpaymentinformation.txtSecurityCode, strValue);
    }
	
	public void SelectExpirationMonth(String strValue)
    {
        CommonMethods.SelectComboValue(this.driver, this.orpaymentinformation.cmbExpiryMonth, strValue);
    }
	
	public void SelectExpirationYear(String strValue)
    {
        CommonMethods.SelectComboValue(this.driver, this.orpaymentinformation.cmbExpiryYear, strValue);
    }
	
	public void ClickReviewOrder()
    {
        CommonMethods.ClickButton(this.driver, this.orpaymentinformation.btnReviewOrder); // btnReviewOrder
    }
}
