package com.iengineering.helper;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Set of commonly used actions invoked by executing JavaScript on a web page
 */

public class JavascriptActions {

    //private final static int WEBDRIVER_WAIT_TIMEOUT_SEC = 15;
    private final JavascriptExecutor js;
    private final WebDriver driver;
    private final By bannerNotificationContainerBy = By.cssSelector(
            ".banner-notifications-placeholder");
    private final By globalNavigationBy = By.cssSelector("#globalNavigation");

    public JavascriptActions(WebDriver driver) {
        this.js = (JavascriptExecutor) driver;
        this.driver = driver;
    }

    public void click(String cssSelector) {
        js.executeScript("$('" + cssSelector + "').click()");
    }

    public void click(WebElement element) {
        js.executeScript("$(arguments[0])[0].click()", element);
    }

    public void focus(String cssSelector) {
        js.executeScript("$('" + cssSelector + "').focus()");
    }

    public void focus(WebElement element) {
        js.executeScript("$(arguments[0]).focus()", element);
    }

    public Object execute(String script, WebElement element) {
        return js.executeScript(script, element);
    }

    public void mouseOver(WebElement element) {
        js.executeScript("$(arguments[0]).mouseenter()", element);
    }

    public void scrollToBottom() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollIntoView(By elementBy) {
        scrollIntoView(driver.findElement(elementBy));
    }

    public void scrollIntoView(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollBy(int x, int y) {
        js.executeScript("window.scrollBy(arguments[0], arguments[1])", x, y);
    }

    public String getWindowErrors() {
        return js.executeScript("return window.errors || ''").toString();
    }

    public Long getCurrentPosition() {
        return (Long) js.executeScript("return window.pageYOffset;");
    }

    public void scrollToSpecificElement(WebElement element) {
        try {
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (WebDriverException e) {
            //Nothing
            }
        }

}
