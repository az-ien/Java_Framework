package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_ReviewOrder {

	@CacheLookup
	@FindBy (how = How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='Place Order'])[1]/following::button[1]")
	public WebElement btnPlaceOrder;
}
