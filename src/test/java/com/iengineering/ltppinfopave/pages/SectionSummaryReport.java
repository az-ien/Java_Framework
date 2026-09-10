package com.iengineering.ltppinfopave.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.iengineering.helper.CommonMethods;
import com.iengineering.helper.GlobalWaitTime;
import com.iengineering.ltppinfopave.objects.OR_SectionSummaryReport;

import java.util.Objects;

public class SectionSummaryReport {
	public WebDriver driver;
	OR_SectionSummaryReport orSectionSummaryReport;

	public SectionSummaryReport(WebDriver driver) {
		this.driver = driver;
		this.orSectionSummaryReport = PageFactory.initElements(driver, OR_SectionSummaryReport.class);
	}

	public void ClickBtnExportExcel() {
		CommonMethods.ClickButton(this.driver, this.orSectionSummaryReport.btnExportExcel);
	}

	public void SelectState(int intState) {
		/* CommonMethods.SelectComboValue(this.driver,
		 this.orsectionsummaryreport.CmbState,strState);
		GlobalWaitTime.getShortWaitTime();*/
		Select oelement = new Select(this.orSectionSummaryReport.cmbState);
		//List<WebElement> selections = oelement.getOptions();
		oelement.getOptions();
		oelement.selectByIndex(intState);
	}

	public void SelectSection(int intSection) {
		/* CommonMethods.SelectComboValue(this.driver,
		this.orsectionsummaryreport.CmbSection, strSection);
		GlobalWaitTime.getShortWaitTime();*/
		Select oelement = new Select(this.orSectionSummaryReport.cmbSection);
		//List<WebElement> selections = oelement.getOptions();
		oelement.getOptions();
		oelement.selectByIndex(intSection);
	}

	public int StateCount() {
		Select oSelect = new Select(this.orSectionSummaryReport.cmbState);
		return oSelect.getOptions().size();
	}

	public int SectionCount() {
		Select oSelect = new Select(this.orSectionSummaryReport.cmbSection);
		return oSelect.getOptions().size();
	}

	public void SelectUnit(String value) {
		if (Objects.equals(value, "Metric"))
			CommonMethods.ClickButton(this.driver, this.orSectionSummaryReport.rdoUnit);

		if (Objects.equals(value, "US Customary"))
			CommonMethods.ClickButton(this.driver, this.orSectionSummaryReport.rdoUnitM);
	}

	public String SelectedSection() {
		return this.orSectionSummaryReport.cmbSection.getText();
	}
}
