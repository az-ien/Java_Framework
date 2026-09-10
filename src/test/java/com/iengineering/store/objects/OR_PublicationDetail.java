package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_PublicationDetail {
	@CacheLookup
	@FindBy (how = How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='In Stock'])[4]/following::button[3]" )
	public WebElement btnAddtoCart;
	
	@CacheLookup
	@FindBy (how = How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='Add to Cart'])[4]/following::button[1]" )
	public WebElement btnGotoCart;

}