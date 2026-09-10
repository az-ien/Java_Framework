package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_PlaceOrder {
	@CacheLookup
	@FindBy (how = How.XPATH, using = "//h4[contains(text(),'Thank you for your purchase.')]" )
	public WebElement msgSucess;

}
