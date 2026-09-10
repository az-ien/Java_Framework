package com.iengineering.ltppinfopave.pages;

import com.iengineering.helper.CommonMethods;
import com.iengineering.helper.GlobalWaitTime;
import com.iengineering.ltppinfopave.objects.OR_ClimateTool;
import com.iengineering.ltppinfopave.objects.OR_DataSelectionAndDownload;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.apache.logging.log4j.Level.INFO;


public class ClimateTool {
    public WebDriver driver;
    private static Logger logger = LogManager.getLogger(ClimateTool.class);
    OR_ClimateTool orClimateTool = null;

    public ClimateTool(WebDriver driver)
    {
        this.driver = driver;
        this.orClimateTool = PageFactory.initElements(this.driver, OR_ClimateTool.class);
    }

    public String ReturnSectionsCount()
    {
        String valSectionCount = CommonMethods.ReturnTextOfElement(this.driver,orClimateTool.lblSectionCount);
        logger.log(INFO,"Section Count:" + valSectionCount);
        return valSectionCount;
    }

    public boolean SectionCount()
    {
        String Count = ReturnSectionsCount();
        String ActualCount = "(2581)";
        boolean isCorrect = false;
        try {
            if (Count.equals(ActualCount))
            {
                isCorrect = true;
            }
        } catch (TimeoutException e) {
             return isCorrect;
        }
        return isCorrect;
    }
}
