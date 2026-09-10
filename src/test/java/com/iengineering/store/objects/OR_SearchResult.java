package com.iengineering.store.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_SearchResult {

	@CacheLookup
	@FindBy (how = How.XPATH, using = "/html/body/section[1]/div/div/div/div[2]/div[2]/div[3]/div/div[2]/div/h5/a")
	public WebElement btnResult1;
}
