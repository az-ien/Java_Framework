package com.iengineering.ltppinfopave.testcases;

import com.iengineering.data.XMLDataReader;
import com.iengineering.helper.ApplicationSetup;
import com.iengineering.ltppinfopave.pages.DataSelectionAndDownload;
import com.iengineering.ltppinfopave.pages.Home;
import com.iengineering.ltppinfopave.pages.StandardDataRelease;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.apache.logging.log4j.Level.INFO;


public class SDRGuideLinks {
  // Creating a logger
  private static final Logger logger = LogManager.getLogger(SDRGuideLinks.class);
  private WebDriver driver;
  private XMLDataReader xmldatareader;
  private String strxmlfile;

  // Before Test is not required as per the implementation
  @BeforeTest
  public void setup() {
    logger.log(INFO, "Constructor Called");
    this.xmldatareader = new XMLDataReader();
    this.strxmlfile = "testdata.xml";
  }

  @Test
  public void getstarted()
  {
    logger.log(INFO, "Test Execution Started");
    String strProject = "ltppinfopave";
    ApplicationSetup applicationsetup = new ApplicationSetup(this.driver);
    this.driver = applicationsetup.NavigateApplication("dev", "Chrome", "ltppinfopave");
    String SDRGuide = this.xmldatareader.ReturnXMLNode("dev", "guide", this.strxmlfile, "ltppinfopave");
    Home home = new Home(this.driver);
    StandardDataRelease standarddatarelease = new StandardDataRelease(driver);
    DataSelectionAndDownload dataselectionanddownload = new DataSelectionAndDownload(this.driver);
    Assert.assertEquals(SDRGuide, home.SDRLink()); // Guide Link on Home Page
    home.MnuStandardDataRelease();
    standarddatarelease.ClickUserGuide();
    Assert.assertEquals(
        SDRGuide, standarddatarelease.SDRLink()); // Guide Link on Standard Data Release Page
    standarddatarelease.ClickbtnDialogClose();
    home.MnuDataSelectionAndDownLoad();
    dataselectionanddownload.ClickAbout();
    Assert.assertEquals(
        SDRGuide,
        dataselectionanddownload.SDRLink()); // Guide Link on Data Selection and Download Page
  }

  @AfterTest
  public void teardown() {
    logger.info("Closing Browser and Driver instance");
      this.driver.quit();
  }
}
