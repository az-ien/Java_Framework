package com.iengineering.store.pages;

import com.iengineering.store.objects.OR_ReviewOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.iengineering.helper.CommonMethods;

public class ReviewOrder {

	private final WebDriver driver;

    private final OR_ReviewOrder orrevieworder;

    public ReviewOrder(WebDriver driver)
    {
        this.driver = driver;
        this.orrevieworder = PageFactory.initElements(this.driver, OR_ReviewOrder.class);
    }
    
    public void ClickBtnPlaceOrdern()
    {
        CommonMethods.ClickLink(this.driver, this.orrevieworder.btnPlaceOrder);
    }
    
}
