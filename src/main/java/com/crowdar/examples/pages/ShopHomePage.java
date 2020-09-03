package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShopHomePage extends PageBaseShop {

    public ShopHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    private final String BUTTON_SIGIN_CSS_SELECTOR ="#header > div.nav > div > div > nav > div.header_user_info > a";
    private final String HOME_ELEMENT_CSS_SELECTOR ="#home-page-tabs > li.active > a";

    public void go() {
        navigateToCompleteURL();
    }

    public void clickSiginButton(){
        clickElement(By.cssSelector(BUTTON_SIGIN_CSS_SELECTOR));
    }
    public void verifyHome(){
        Assert.assertTrue(isElementVisible(By.cssSelector(HOME_ELEMENT_CSS_SELECTOR)), "No se encontró el elemento");
    }

}
