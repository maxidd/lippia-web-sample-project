package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShopLoginPage extends PageBaseShop {

    public ShopLoginPage(RemoteWebDriver driver) {
        super(driver);
        this.url ="";
    }

    private final String HEADING_LOGIN_CCS_SELECTOR = "#center_column > h1";
    private final String EMAIL_LOGIN_CSS_SELECTOR = "#email";
    private final String PASSWORD_LOGIN_CSS_SELECTOR = "#passwd";
    private final String BUTTON_SIGNIN_CSS_SELECTOR = "#SubmitLogin > span";

    public void verifyPage(String pantalla){
        switch (pantalla){
            case "Login":
                verifyLoginPage();
                break;
            case "My Account":
                break;
        }

    }
    public void verifyLoginPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(HEADING_LOGIN_CCS_SELECTOR)));
    }

    public void completeEmail(String email){
        completeField(By.cssSelector(EMAIL_LOGIN_CSS_SELECTOR), email);
    }

    public void completePassword(String password){
        completeField(By.cssSelector(PASSWORD_LOGIN_CSS_SELECTOR), password);
    }

    public void clickButtonSignIn(){
        clickElement(By.cssSelector(BUTTON_SIGNIN_CSS_SELECTOR));
    }
}
