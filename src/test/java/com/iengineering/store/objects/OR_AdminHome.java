package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_AdminHome {

	@CacheLookup
	@FindBy (how = How.LINK_TEXT, using = "Promotions")
	public WebElement lnkPromotions;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "btnAddNewApplication")
	public WebElement btnAddPromotion;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "btnCopyPromotion")
	public WebElement btnCopyPromotion;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "btnDeleteSeleted")
	public WebElement btnDeleteSelected;
}
