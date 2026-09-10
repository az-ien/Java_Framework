package com.iengineering.common;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.iengineering.data.XMLDataReader;
import com.iengineering.helper.ApplicationSetup;

@SuppressWarnings("NewClassNamingConvention")
@Test
public class BrokenLinksURL {

    private WebDriver driver;
    private int respCode;
    private XMLDataReader xmldatareader;
    private boolean logbrokenonly;

    @BeforeTest
    public void SetupMethod() {
        this.respCode = 200;
        this.xmldatareader = new XMLDataReader();
        this.logbrokenonly = false;
        // string strXmlFile = "UserName.xml";

    }
@Test
    @Parameters({"Environment","Browser","Project"})
    public void LinkVerification(@Optional("dev")String strEnvironment, @Optional("Chrome")String strBrowser,@Optional("ltppinfopave")String strProject ) {


        int skipped = 0;
        int valid = 0;
        int broken = 0;

        ApplicationSetup applicationsetup = new ApplicationSetup(this.driver);
        this.driver = applicationsetup.NavigateApplication("dev", "Chrome", strProject);
        String homePage = this.xmldatareader.ReturnXMLNode(strEnvironment, "url", "testdata.xml", "strProject");
        //List<WebElement> links = driver.findElements(By.tagName("a"));

        List<String> links = this.xmldatareader.ReturnXMLNodes(strEnvironment, "url", "testurldata.xml", "common");
        Iterator<String> it = links.iterator();

        while (it.hasNext()) {
            String url = it.next();

            //System.out.println(url);

            /*if (url == null || url.length() == 0 || url.endsWith("#")
                    || url.toLowerCase().startsWith("javascript") || url.contains("#")
                    || url.toLowerCase().endsWith("pdf")) {

                if(!logbrokenonly)System.out.println(url + "URL is either not configured for anchor tag or it is empty");
                continue;
            }

            if (!url.startsWith(homePage)) {
                if(!logbrokenonly)System.out.println(url + "URL belongs to another domain, skipping it.");
                skipped++;
                continue;
            }*/

            try {
                HttpURLConnection huc = (HttpURLConnection) (new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                respCode = huc.getResponseCode();
                if (respCode >= 400) {
                    System.out.println(url + ", is a broken link");
                    huc.disconnect();
                    broken++;
                } else {
                    if(!logbrokenonly)System.out.println(url + ", is a valid link");
                    huc.disconnect();
                    valid++;
                }

            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                //e.printStackTrace();
                System.out.println(url + ", is a broken link");
                broken++;
            } catch (IOException e) {
                // TODO Auto-generated catch block
               // e.printStackTrace();
                System.out.println(url + ", is a broken link");
                broken++;
            } catch (TimeoutException e){
                System.out.println(url + ", is a broken link");
                                broken++;
            } catch (Exception e){
                System.out.println(url + ", is a broken link");
                broken++;
            }

        }
        /*System.out.println("Broken: "+broken+ " Valid: "+valid+" Skipped: "+skipped);
        try {
            Assert.assertEquals(broken, 0);
        }
        catch (Exception e){
            // Nothing
        }*/

    }

    @AfterTest
    public void close() {
        this.driver.close();
    }

}

