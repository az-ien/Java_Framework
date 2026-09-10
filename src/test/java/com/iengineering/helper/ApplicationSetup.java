package com.iengineering.helper;

import com.iengineering.data.XMLDataReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.devtools.DevTools;

public class ApplicationSetup {

  private static final Logger logger = LogManager.getLogger(ApplicationSetup.class);
  private WebDriver driver;

  public ApplicationSetup(WebDriver driver) {
    this.driver = driver;
  }


  public WebDriver NavigateApplication(
      String strEnvironment, String strBrowser, String strProject) {
    switch (strBrowser.toUpperCase()) {
      case "CHROME":
        {
          ChromeOptions options = new ChromeOptions();
          // options.addArguments("--incognito");
          //options.addArguments("--start-maximized");
          //options.addArguments("--no-default-browser-check");
          //options.addArguments("disable-infobars");
          WebDriverManager.chromedriver().setup();
          this.driver = new ChromeDriver(options);
          break;
        }
      case "FIREFOX":
        {
          FirefoxOptions options = new FirefoxOptions();
          //options.addArguments("--incognito");
          //options.addArguments("--start-maximized");
          //options.addArguments("disable-infobars");
          WebDriverManager.firefoxdriver().setup();
          this.driver = new FirefoxDriver(options);
          break;
        }
      case "EDGE":
        {
          WebDriverManager.edgedriver().setup();
          EdgeOptions options = new EdgeOptions();
          this.driver = new EdgeDriver(options);
          this.driver.manage().window().maximize();
          break;
        }
      case "IE":
        {
          WebDriverManager.iedriver().setup();
          InternetExplorerOptions options = new InternetExplorerOptions();
          this.driver = new InternetExplorerDriver(options);
          this.driver.manage().window().maximize();
          break;
        }
      default:
        {
          System.out.println("Invalid Browser parameter to ApplicationSetup method");
        }
    }
    logger.info("Selected Browser for this test is: " + strBrowser.toUpperCase());
    XMLDataReader xmldatareader = new XMLDataReader();
    this.driver.get(xmldatareader.ReturnXMLNode(strEnvironment, "url", "testdata.xml", strProject));
    return this.driver;
  }

  /**
   * Intiate the driver Instance and in respective Browser and return the Webdriver instance. URL is
   * directly passed
   *
   * @param strBrowser Browser in which test will be executed
   * @param strURL URL of the Webpage, under test
   * @return Return the driver handler instance
   */
  public WebDriver NavigateApplication(
      String strBrowser,  String strURL) {
    switch (strBrowser.toUpperCase()) {
      case "CHROME":
        {
          ChromeOptions options = new ChromeOptions();
          options.addArguments("--incognito");
          options.addArguments("--start-maximized");
          options.addArguments("--no-default-browser-check");
          options.addArguments("disable-infobars");
          WebDriverManager.chromedriver().setup();
          this.driver = new ChromeDriver(options);
          break;
        }
      case "FIREFOX":
        {
          FirefoxOptions options = new FirefoxOptions();
          options.addArguments("--incognito");
          options.addArguments("--start-maximized");
          options.addArguments("disable-infobars");
          WebDriverManager.firefoxdriver().setup();
          this.driver = new FirefoxDriver(options);
          break;
        }
      case "EDGE":
        {
          WebDriverManager.edgedriver().setup();
          EdgeOptions options = new EdgeOptions();
          this.driver = new EdgeDriver(options);
          this.driver.manage().window().maximize();
          break;
        }
      case "IE":
        {
          WebDriverManager.iedriver().setup();
          InternetExplorerOptions options = new InternetExplorerOptions();
          this.driver = new InternetExplorerDriver(options);
          this.driver.manage().window().maximize();
          break;
        }
      default:
        {
          logger.error("Invalid Browser parameter to ApplicationSetup method: " + strBrowser.toUpperCase());
        }
    }
    logger.info("Selected Browser for this test is: " + strBrowser.toUpperCase());
    this.driver.get(strURL);
    return this.driver;
  }
}
