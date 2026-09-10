package com.iengineering.ltppinfopave.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class OR_SectionSummaryReport {

	@CacheLookup
	@FindBy(how = How.ID, using = "ddlStates_StateBar")
	public WebElement cmbState;

	@CacheLookup
	@FindBy(how = How.ID, using = "ddlSections_StateBar")
	public WebElement cmbSection;

	@CacheLookup
	@FindBy(how = How.ID, using = "ExportButton")
	public WebElement btnExportExcel;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'/Data/SectionSummaryReport')]")
	public WebElement mnuSectionSummaryReport;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@class='link'][contains(text(),'Data')]")
	public WebElement mnuData;

	@CacheLookup
	@FindBy(how = How.ID, using = "rbUS")
	public WebElement rdoUnit;

	@CacheLookup
	@FindBy(how = How.ID, using = "rbSI")
	public WebElement rdoUnitM;

}
