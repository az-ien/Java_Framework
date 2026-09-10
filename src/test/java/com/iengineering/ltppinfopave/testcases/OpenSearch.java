package com.iengineering.ltppinfopave.testcases;

import com.iengineering.helper.ApplicationSetup;
import com.iengineering.ltppinfopave.pages.Home;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class OpenSearch {
    private static final Logger logger = LogManager.getLogger(SDRGuideLinks.class);
    private WebDriver driver;

    @Test
    public void getstarted() {
        String strProject = "ltppinfopave";
        ApplicationSetup applicationsetup = new ApplicationSetup(this.driver);
        this.driver = applicationsetup.NavigateApplication("production", "Chrome", strProject);
        Home home = new Home(this.driver);
        home.TypeSearch("SPS10");
        home.ClickSearch();
        Assert.assertFalse(home.isSearchResultFound());
    }
    @AfterTest
    public void teardown() {
        logger.info("Closing Browser and Driver instance");
        //this.driver.quit();
    }
}
