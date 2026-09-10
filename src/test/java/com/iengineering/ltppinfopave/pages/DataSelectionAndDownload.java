package com.iengineering.ltppinfopave.pages;

import com.iengineering.helper.CommonMethods;
import com.iengineering.ltppinfopave.objects.OR_DataSelectionAndDownload;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.apache.logging.log4j.Level.INFO;


public class DataSelectionAndDownload {
    public WebDriver driver;
    private static Logger logger = LogManager.getLogger(DataSelectionAndDownload.class);
    OR_DataSelectionAndDownload orDataSelectionAndDownload = null;

    public DataSelectionAndDownload(WebDriver driver)
    {
        this.driver = driver;
        this.orDataSelectionAndDownload = PageFactory.initElements(this.driver, OR_DataSelectionAndDownload.class);
    }

    public String SDRLink()
    {
        String link = this.orDataSelectionAndDownload.lnkSDRGuide.getAttribute("href");
        return CommonMethods.ReturnEndSubString(link,19); // File naming convention is XXXX-XXX-NN-NNN.xxx (19 Char)
    }

    public void ClickAbout()
    {
        CommonMethods.ClickButton(this.driver,this.orDataSelectionAndDownload.btnAbout);
        logger.log(INFO,"About Button Clicked");
    }
}
