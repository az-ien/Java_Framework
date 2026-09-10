package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_Accounts {

	@CacheLookup
	@FindBy (how = How.ID, using = "_searchTerm")
	public WebElement txtGbSearch;
	
	@CacheLookup
	@FindBy (how = How.ID, using = "btn-search")
	public WebElement btnGbSearch;
}
