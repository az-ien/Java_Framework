package com.iengineering.ltppinfopave.testcases;

import com.iengineering.helper.ApplicationSetup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.iengineering.helper.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;


import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class DataSelectionTest {

    private WebDriver driver;
    private StringBuilder verificationErrors;
    private boolean acceptNextAlert = true;
    private boolean structure;
    private boolean climate;
    private boolean traffic;
    private boolean performance;
    private boolean addbucket;
    private boolean filter;

    @BeforeTest
    public void SelectionCriteria() {
        this.filter = false;
        this.structure = true;
        this.climate = false;
        this.traffic = false;
        this.performance = false;
        this.addbucket = false;

        this.verificationErrors = new StringBuilder();
    }

    @Test
    public void SelectData() throws InterruptedException {
        String strProject = "ltppinfopave";
        ApplicationSetup applicationsetup = new ApplicationSetup(this.driver);
        this.driver = applicationsetup.NavigateApplication("dev", "Chrome", strProject);

        CommonMethods.ClickMenuItem(this.driver, this.driver.findElement(By.xpath("//li[@class='listItem']/a[contains(@title,'Data')]")), this.driver.findElement(By.xpath("//a[contains(text(),'Data Selection and Download')]")));


        if (this.filter) {
            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("Section")));
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
            Thread.sleep(2000);
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("section_1679")));
            Thread.sleep(2000);
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.xpath("//*[@id=\"ui-id-11\"]/div[3]/button[1]")));
            Thread.sleep(2000);
        }

        if (this.structure) {

            Thread.sleep(2000);
            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("chkadv_Structure")));
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
            List<WebElement> StructureElement = this.driver.findElements(By.id("//div[@id='JTree_Structure']//a"));
            if(StructureElement.size() == 0) {
                System.out.println(StructureElement.toString() + " STILL NO ELEMENTS PICKED");
            }
        /*    Thread.sleep(2000);
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
            Iterator<WebElement> selement = StructureElement.iterator();
            while (selement.hasNext()) {
                try {
                    CommonMethods.ClickButton(this.driver,selement.next());
                    CommonMethods.ClickAndWaitForJsLoad(this.driver);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }

            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("btnAddSelection_Structure"))); */
        }

        if (this.climate) {
            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.linkText("Climate")));
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
            Thread.sleep(2000);
            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("chkadv_Climate")));
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
            List<WebElement> ClimateElement = this.driver.findElements(By.xpath("//div[@id='JTree_Climate']//a"));
            Iterator<WebElement> celement = ClimateElement.iterator();
            while (celement.hasNext()) {
                try {
                    CommonMethods.ClickButton(this.driver, celement.next());
                    CommonMethods.ClickAndWaitForJsLoad(this.driver);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }

            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("btnAddSelection_Climate")));

        }

        if (this.traffic) {
            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("Traffic")));
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
            Thread.sleep(2000);
            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("chkadv_Traffic")));
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
            List<WebElement> TrafficElement = this.driver.findElements(By.xpath("//div[@id='JTree_Traffic']//a"));
            Iterator<WebElement> telement = TrafficElement.iterator();
            while (telement.hasNext()) {
                try {
                    CommonMethods.ClickButton(this.driver,telement.next());
                    CommonMethods.ClickAndWaitForJsLoad(this.driver);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }

            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("btnAddSelection_Traffic")));
        }

        if (this.performance) {
            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.linkText("Performance")));
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
            Thread.sleep(2000);
            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("chkadv_Performance")));
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
            List<WebElement> PerformanceElement = this.driver.findElements(By.xpath("//div[@id='JTree_Performance']//a"));
            Iterator<WebElement> pelement = PerformanceElement.iterator();
            while (pelement.hasNext()) {
                    try {
                        CommonMethods.ClickButton(this.driver, pelement.next());
                        CommonMethods.ClickAndWaitForJsLoad(this.driver);
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }

            }

            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("btnAddSelection_Performance")));
        }
        CommonMethods.ClickAndWaitForJsLoad(this.driver);
        if (this.addbucket) {
            CommonMethods.ClickButton(this.driver, this.driver.findElement(By.id("btnAddBucket")));
            CommonMethods.ClickAndWaitForJsLoad(this.driver);
        }

    }

    /*@AfterTest
    public void teardown() {
     try
            {
               // this.driver.Quit();
            }
            catch (Exception)
            {
                // Ignore errors if unable to close the browser
            }
        Assert.assertEquals(, this.verificationErrors.toString());
    }*/

    private boolean IsElementPresent(By by) {
        try {
            this.driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean IsAlertPresent() {
        try {
            this.driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


    public String CloseAlertAndGetItsText() {
        try {

            String alertText = this.driver.switchTo().alert().getText();
            if (this.acceptNextAlert) {
                this.driver.switchTo().alert().accept();
            } else {
                this.driver.switchTo().alert().dismiss();
            }

            return alertText;
        } finally {
            this.acceptNextAlert = true;
        }
    }


}
