package com.iengineering.ltppinfopave.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class OR_DataSelectionAndDownload {

    @FindBy(how = How.XPATH, using = "//a[@title='About']/span[@class='helpIconHeader']")
    public WebElement btnAbout;

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'here')])[1]")
    public WebElement lnkSDRGuide;
}
