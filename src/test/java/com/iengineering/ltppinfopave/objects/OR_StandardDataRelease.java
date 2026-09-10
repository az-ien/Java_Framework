package com.iengineering.ltppinfopave.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class OR_StandardDataRelease {
    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'User’s Guide')])[2]")
    public WebElement lnkSDRGuide;

    @FindBy(how = How.XPATH, using = "(//b[@class='fileDownload'])[2]")
    public WebElement nameSDRGuide;

    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public WebElement btnDialogClose;

}
