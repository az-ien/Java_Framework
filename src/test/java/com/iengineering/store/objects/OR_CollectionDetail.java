package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_CollectionDetail {

	@CacheLookup
	@FindBy (how = How.ID, using = "Promotion-Type")
	public WebElement cboFormat;
}
