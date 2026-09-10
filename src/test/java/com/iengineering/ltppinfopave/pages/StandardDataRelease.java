package com.iengineering.ltppinfopave.pages;

import com.iengineering.helper.CommonMethods;
import com.iengineering.helper.GlobalWaitTime;
import com.iengineering.ltppinfopave.objects.OR_StandardDataRelease;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StandardDataRelease {

  public WebDriver driver;
  OR_StandardDataRelease orStandardDataRelease = null;

  public StandardDataRelease(WebDriver driver) {
    this.driver = driver;
    this.orStandardDataRelease =
        PageFactory.initElements(this.driver, OR_StandardDataRelease.class);
  }

  public String SDRLink() {
    // String link = this.orStandardDataRelease.nameSDRGuide.getAttribute("text");
    WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
    wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath("(//b[@class='fileDownload'])[2]")));
    String link = this.orStandardDataRelease.nameSDRGuide.getText();
    return CommonMethods.ReturnEndSubString(
        link, 19); // File naming convention is XXXX-XXX-NN-NNN.xxx (19 Char)
  }

  public void ClickUserGuide() {
    CommonMethods.ClickLink(this.driver, orStandardDataRelease.lnkSDRGuide);
  }

  public void ClickbtnDialogClose() {
    CommonMethods.ClickButton(this.driver, orStandardDataRelease.btnDialogClose);
  }
}
