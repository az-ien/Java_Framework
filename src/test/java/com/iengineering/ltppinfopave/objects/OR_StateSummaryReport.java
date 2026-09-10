package com.iengineering.ltppinfopave.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_StateSummaryReport {

	@CacheLookup
	@FindBy(how = How.ID, using = "ddlStates_StateBar")
	public WebElement cmbState;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "ExportButton")
	public WebElement btnExportExcel;
}
