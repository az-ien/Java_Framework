package com.iengineering.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

// import com.iengineering.misc.GlobalWaitTime;
// import com.iengineering.misc.RandomNumbers;

public class CommonMethods {

  private static Logger logger = LogManager.getLogger();

  public static void ClickAndWaitForJsLoad(WebDriver driver) {
    By spnLoading = By.className("divLoading");
    WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
    wait.until(ExpectedConditions.invisibilityOfElementLocated(spnLoading));
  }

  public static void ClickAndWaitForJsLoad(WebDriver driver, String strLoaderName) {
    By spnLoading = By.className(strLoaderName);
    WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
    wait.until(ExpectedConditions.invisibilityOfElementLocated(spnLoading));
  }

  /**
   * @param driver
   * @param Web element
   * @param strText
   */
  public static void TypeInWebElement(WebDriver driver, WebElement element, String strText) {
    ClickAndWaitForJsLoad(driver);
    try {
      WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
      wait.until(ExpectedConditions.elementToBeClickable(element));
      element.click();
      element.clear();
      element.sendKeys(strText);
    } catch (TimeoutException e) {
      logger.error("WebDriver couldn’t locate the element");
    //} catch (ElementNotVisibleException e) {
      // System.out.println("WebElement is not visible");
      //logger.error("WebElement is not visible");
    } catch (Exception e) {
      logger.trace(e); // e.printStackTrace();
    }
  }

  public static void ClickButton(WebDriver driver, WebElement element) {
    try {
      ClickAndWaitForJsLoad(driver);
      WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
      wait.until(ExpectedConditions.elementToBeClickable(element));
      element.click();
    } catch (TimeoutException e) {
      logger.error("WebDriver couldn’t locate the element");
    }
  }

  public static void SelectComboValue(WebDriver driver, WebElement element, String strValue) {
    try {
      ClickAndWaitForJsLoad(driver);
      WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
      wait.until(ExpectedConditions.elementToBeClickable(element));
      element.click();
      if (strValue.equalsIgnoreCase("Random")) {
        Select oelement = new Select(element);
        List<WebElement> selections = oelement.getOptions();
        int intIndex = RandomNumbers.RandomNumberGenerator(1, selections.size() - 1);
        oelement.selectByIndex(intIndex);
      } else {
        element.sendKeys(strValue);
        element.click();
      }
    } catch (TimeoutException e) {
      logger.error("WebDriver couldn’t locate the element");
    }
  }

  public static void SelectComboValue(WebDriver driver, WebElement element, int intValue) {
    try {
      ClickAndWaitForJsLoad(driver);
      WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
      wait.until(ExpectedConditions.elementToBeClickable(element));
      element.click();
      Select oelement = new Select(element);
      List<WebElement> selections = oelement.getOptions();
      oelement.selectByIndex(intValue);
    } catch (TimeoutException e) {
      logger.error("WebDriver couldn’t locate the element");
    }
  }

  public static void ClickLink(WebDriver driver, WebElement element) {
    try {
      ClickAndWaitForJsLoad(driver);
      WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
      wait.until(ExpectedConditions.elementToBeClickable(element));
      element.click();
    } catch (TimeoutException e) {
      logger.error("WebDriver couldn’t locate the element");
    }
  }

  public static void SelectSpecificRowCol(
      WebDriver driver, int rowNumber, int colNumber, String tableID) {
    try {

      TableHandler tablehandler = new TableHandler(driver);
      tablehandler.ClickSpecifiedTableRowCol(driver, tableID, rowNumber, colNumber);
    } catch (TimeoutException e) {
      logger.error("WebDriver couldn’t locate the element");
    }
  }

  /**
   * @param driver
   * @param element
   * @return Return Text Of Element
   */
  public static String ReturnTextOfElement(WebDriver driver, WebElement element) {
    ClickAndWaitForJsLoad(driver);
    WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
    wait.until(ExpectedConditions.elementToBeClickable(element));
    String strText = element.getText();
    logger.info("ReturnTextOfElement : " + strText);
    return strText;
  }

  public static boolean isElementPresent(WebDriver driver, WebElement element) {
    boolean isPresent = false;
    try {
      ClickAndWaitForJsLoad(driver);
      WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
      wait.until(ExpectedConditions.elementToBeClickable(element));
      logger.info("Element Found: " + element.getText());
      if (element.isDisplayed()) {
        isPresent = true;
      }
    } catch (TimeoutException e) {
      logger.error("Element Not Found." + element);
      return isPresent;
    }
    return isPresent;
  }

  public static void ClickCheckBox(WebDriver driver, WebElement element) {
    try {
      ClickAndWaitForJsLoad(driver);
      WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getIntWaitTime());
      wait.until(ExpectedConditions.elementToBeClickable(element));
      element.click();
    } catch (TimeoutException e) {
      logger.error("WebDriver couldn’t locate the element");
    }
  }

  public static void ClickMenuItem(WebDriver driver, WebElement parentMenu, WebElement childMenu) {
    try {

      Actions action = new Actions(driver);
      // move to ParentMenu
      action.moveToElement(parentMenu).perform();
      // wait for the sub-menu to come up
      Thread.sleep(1000);
      // inside sub-menu click
      action.moveToElement(childMenu).build().perform();
      childMenu.click();
    } catch (Exception expn) {
      // catching the exception
      logger.trace(expn);
    }
  }
  /*
    public static void ScrollAndClick(WebElement element, WebDriver driver)
    {
        JavascriptActions jsActions = new JavascriptActions(driver);
        jsActions.scrollToElement(element,1);
        element.click();
    }
  */
  public static String ReturnEndSubString(String word, int numChar) {
    if (word.length() == numChar) {
      return word;
    } else if (word.length() > numChar) {
      return word.substring(word.length() - numChar);
    } else {
      // whatever is appropriate in this case
      throw new IllegalArgumentException("word has fewer than " + numChar + " characters!");
    }
  }

  public static void WaitForPageLoad(WebDriver driver) {
    ExpectedCondition<Boolean> pageLoadCondition = new
            ExpectedCondition<Boolean>() {
              public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
              }
            };
    WebDriverWait wait = new WebDriverWait(driver, GlobalWaitTime.getLongWaitTime());
    wait.until(pageLoadCondition);
  }
}
