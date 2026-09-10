package com.iengineering.store.pages;

import com.iengineering.store.objects.OR_PublicationDetail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.iengineering.helper.CommonMethods;

public class PublicationDetail {
	
	private final WebDriver driver;

    private final OR_PublicationDetail orpublicationdetail;

    public PublicationDetail(WebDriver driver)
    {
        this.driver = driver;
        this.orpublicationdetail = PageFactory.initElements(this.driver, OR_PublicationDetail.class);
    }
    
    public void ClickBtnAddtoCart()
    {
        CommonMethods.ClickButton(this.driver, orpublicationdetail.btnAddtoCart);
    }
    public void ClickBtnGotoCart()
    {
        CommonMethods.ClickButton(this.driver, orpublicationdetail.btnGotoCart);
    }

}
