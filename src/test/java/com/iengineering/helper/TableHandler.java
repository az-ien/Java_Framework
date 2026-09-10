package com.iengineering.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TableHandler {

	private final WebDriver driver;
	private int intRowNumber;
	// private int intColNumber;

	public TableHandler(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickRandomTableRow(String strTableId) {
		// Table rows that are displayed are counted including the header row that
		// contains column headings.
		int intTableRowCount = this.driver.findElements(By.xpath("//table[@id='" + strTableId + "']" + "/tbody/tr"))
				.size();

		// 2nd row is the first record so 2 and row count is passed to generate a random
		// number
		int intRandomRowNo = RandomNumbers.RandomNumberGenerator(2, intTableRowCount);
		WebElement oRandomRow = this.driver
				.findElement(By.xpath("//*[@id='" + strTableId + "']/tbody[1]/tr[" + intRandomRowNo + "]/td[1]"));
		oRandomRow.click();
	}

	public void ClickSpecificTableRowCol(WebDriver driver, String strTableId, int rowselection, int colselection) {
		// Table rows that are displayed are counted including the header row that
		// contains column headings.
		// 2nd row is the first record
		WebElement oRow = this.driver.findElement(By.xpath(
				"//*[@id='" + strTableId + "']/tbody[1]/tr[" + this.intRowNumber + "]/td[" + colselection + "]"));
		oRow.click();
	}

	public void ClickSpecificTableRow(String strTableId, int intRowNumber) {
		// Table rows that are displayed are counted including the header row that
		// contains column headings.
		// 2nd row is the first record
		WebElement oRow = this.driver
				.findElement(By.xpath("//*[@id='" + strTableId + "']/tbody[1]/tr[" + intRowNumber + "]/td[1]"));
		oRow.click();
	}

	public void ClickSpecifiedTableRowCol(WebDriver driver, String strTableId, int intRowNumber, int intColNumber) {
		// Table rows that are displayed are counted including the header row that
		// contains column headings.
		// 2nd row is the first record

		WebElement oRow = this.driver.findElement(
				By.xpath("//*[@id='" + strTableId + "']/tbody[1]/tr[" + intRowNumber + "]/td[" + intColNumber + "]"));
		CommonMethods.ClickAndWaitForJsLoad(driver);
		WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
		wait.until(ExpectedConditions.elementToBeClickable(oRow));
		oRow.click();
	}

	public int GetNumberOfRowsInTable(String strTableId) {
		return this.driver.findElements(By.xpath("//table[@id='" + strTableId + "']" + "/tbody/tr"))
				.size();
	}

	public boolean CheckTableHasRecord(String strTableId, String strRowText, String strRowCount) {
		int rowCount;
		if (strRowCount.equalsIgnoreCase("All")) {
			// Get number of rows in table
			rowCount = this.driver.findElements(By.xpath("//*[@id='" + strTableId + "']/tbody/tr")).size();
		} else {
			rowCount = Integer.parseInt(strRowCount);
		}

		long colCount = this.driver.findElements(By.xpath("//*[@id='" + strTableId + "']/tbody/tr[3]/td")).size();

		// divided xpath In three parts to pass Row_count and Col_count values.
		String strFirst_part = "//*[@id='" + strTableId + "']/tbody/tr[";
		String strSecond_part = "]/td[";
		String strThird_part = "]";

		// Used for loop for number of rows. Starts from the 2nd row
		for (int k = 2; k <= rowCount; k++) {
			// Used for loop for number of columns.
			for (int j = 1; j <= colCount; j++) {
				// Prepared final xpath of specific cell as per values of k and j.
				String final_xpath = strFirst_part + k + strSecond_part + j + strThird_part;

				// Will retrieve value from located cell and if it matches with the parameter
				// value, it will return true, otherwise
				// will return false
				String table_data = this.driver.findElement(By.xpath(final_xpath)).getAttribute("title");
				if (table_data.contains(strRowText)) {
					return true;
				}
			}
		}

		return false;
	}

	public int GetRowNumberHavingValue(WebDriver driver, String tableId, String value) {
		WebElement table = driver.findElement(By.id(tableId));
		WebElement tbody = table.findElement(By.tagName("tbody"));

		List<WebElement> rows = tbody.findElements(By.tagName("tr"));
		// List<String> listOdIds = new List<String>();
		int rowNo = 0;
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = tbody.findElement(By.xpath("//*[@id='" + tableId + "']/tbody/tr[" + (i + 1) + "]"));

			if (row.getText().trim().contains(value)) {
				rowNo = i + 1;
				break;
			}
		}
		return rowNo;
	}
}
