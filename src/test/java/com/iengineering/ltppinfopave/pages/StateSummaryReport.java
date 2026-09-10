package com.iengineering.ltppinfopave.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.iengineering.ltppinfopave.objects.OR_StateSummaryReport;
import com.iengineering.helper.CommonMethods;

public class StateSummaryReport {
	public WebDriver driver;
	OR_StateSummaryReport orStateSummaryReport = null;
	
	public StateSummaryReport(WebDriver driver)
	{
		this.driver = driver;
		this.orStateSummaryReport = PageFactory.initElements(driver, OR_StateSummaryReport.class);
	}
	
	public void SelectState(int intState)
	{
		CommonMethods.SelectComboValue(this.driver, orStateSummaryReport.cmbState, intState);
	}
	
	public void ClickExporttoExcel()
	{
		CommonMethods.ClickButton(this.driver, orStateSummaryReport.btnExportExcel);
	}
}
