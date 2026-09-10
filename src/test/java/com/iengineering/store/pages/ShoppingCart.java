package com.iengineering.store.pages;

import com.iengineering.store.objects.OR_ShoppingCart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.iengineering.helper.CommonMethods;

public class ShoppingCart {

	private final WebDriver driver;

    private final OR_ShoppingCart orshoppingcart;

    public ShoppingCart(WebDriver driver)
    {
        this.driver = driver;
        this.orshoppingcart = PageFactory.initElements(this.driver, OR_ShoppingCart.class);
    }
    
    public void ClickBtnProceedtoCheckout()
    {
        CommonMethods.ClickButton(this.driver, this.orshoppingcart.btnProceedtoCheckout);
    }
    
}