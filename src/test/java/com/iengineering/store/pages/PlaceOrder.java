package com.iengineering.store.pages;

import com.iengineering.store.objects.OR_PlaceOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.iengineering.helper.CommonMethods;

public class PlaceOrder {

	private final WebDriver driver;

    private final OR_PlaceOrder orplaceorder;

    public PlaceOrder(WebDriver driver)
    {
        this.driver = driver;
        this.orplaceorder = PageFactory.initElements(this.driver, OR_PlaceOrder.class);
    }

    public String MsgSuccess()
    {
        return CommonMethods.ReturnTextOfElement(this.driver, this.orplaceorder.msgSucess);
    }
}
