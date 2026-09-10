package com.iengineering.ltppinfopave.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_ClimateTool {
    @FindBy(how = How.ID, using = "tSections")
    public WebElement lblSectionCount;
}
