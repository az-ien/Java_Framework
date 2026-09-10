package com.iengineering.ltppinfopave.testcases;

import com.iengineering.helper.ApplicationSetup;
import com.iengineering.ltppinfopave.pages.ClimateTool;
import com.iengineering.ltppinfopave.pages.Home;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClimateToolLoaded {
    private static final Logger logger = LogManager.getLogger(ClimateToolLoaded.class);
    private WebDriver driver;

  @Test
  public void getstarted() {
    String strProject = "ltppinfopave";
    ApplicationSetup applicationsetup = new ApplicationSetup(this.driver);
    this.driver = applicationsetup.NavigateApplication("dev", "Chrome", strProject);
    Home home = new Home(this.driver);
    ClimateTool climatetool = new ClimateTool(this.driver);
    home.MnuLTPPClimateTool(); // Clicked on ClimateTool menu link
    Assert.assertTrue(climatetool.SectionCount());
  }

  @AfterTest
  public void teardown() {
    logger.info("Closing Browser and Driver instance");
    this.driver.quit();
        }
}
