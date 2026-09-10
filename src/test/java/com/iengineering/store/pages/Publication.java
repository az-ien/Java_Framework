package com.iengineering.store.pages;

import com.iengineering.store.objects.OR_Publication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.iengineering.helper.CommonMethods;

public class Publication {

	private final WebDriver driver;

    private final OR_Publication orpublication;

    public Publication(WebDriver driver)
    {
        this.driver = driver;
        this.orpublication = PageFactory.initElements(this.driver, OR_Publication.class);
    }

    public void ClickLnkPublication()
    {
        CommonMethods.ClickLink(this.driver, this.orpublication.lnkPublication);
    }
}

