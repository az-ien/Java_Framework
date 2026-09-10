package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_ShoppingCart {

	@CacheLookup
	@FindBy (how = How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='Remove Promotion'])[1]/following::button[1]")
	public WebElement btnProceedtoCheckout;
}
