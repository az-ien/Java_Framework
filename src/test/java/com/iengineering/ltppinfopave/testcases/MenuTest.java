package com.iengineering.ltppinfopave.testcases;

import com.iengineering.helper.ApplicationSetup;
import com.iengineering.ltppinfopave.pages.Home;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class MenuTest {
    private static final Logger logger = LogManager.getLogger(MenuTest.class);
    private WebDriver driver;


    /* Before Test is not required as per the implementation
    @BeforeTest
    public void setup() {
        XMLDataReader xmldatareader = new XMLDataReader();
        String strxmlfile = "Username.xml";
    }*/

    @Test
    public void getstarted() {
        String strProject = "ltppinfopave";
        ApplicationSetup applicationsetup = new ApplicationSetup(this.driver);
        this.driver = applicationsetup.NavigateApplication("dev", "Chrome", strProject);
        Home home = new Home(this.driver);
        // Advanced Toggle
        Assert.assertTrue(home.isDataPresent());
        Assert.assertTrue(home.isVisualizationPresent());
        Assert.assertTrue(home.isAnalysisPresent());
        Assert.assertTrue(home.isToolsPresent());
        Assert.assertTrue(home.isLibraryPresent());
        Assert.assertTrue(home.isOperationsPresent());
        Assert.assertTrue(home.isNonLTPPPresent());
        // Toggle Switched
        home.TogAdvance();
        // Simplified Toggle, Present
        Assert.assertTrue(home.isDataPresent());
        Assert.assertTrue(home.isVisualizationPresent());
        Assert.assertTrue(home.isToolsPresent());
        Assert.assertTrue(home.isLibraryPresent());
        // Simplified Toggle, Not Present
        Assert.assertFalse(home.isAnalysisPresent());
        Assert.assertFalse(home.isOperationsPresent());
        Assert.assertFalse(home.isNonLTPPPresent());
    }

    @AfterTest
    public void teardown() {
        logger.info("Closing Browser and Driver instance");
        this.driver.quit();
    }
}
