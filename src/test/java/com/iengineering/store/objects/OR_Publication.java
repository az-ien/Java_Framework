package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_Publication {
	@CacheLookup
	@FindBy (how = How.XPATH, using = "(//div[@class='cat_product_detail'])[1]/h5" )
	public WebElement lnkPublication;

}