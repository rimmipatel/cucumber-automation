package com.sample.signin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageElements {

    @FindBy(xpath = "//*[contains(text(),'Continue with Email')]")
    WebElement continueWithEmail;

    @FindBy(id = "email")
    WebElement emailAddress;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//button[contains(@type,'submit')] ")
    WebElement logIn;

    @FindBy(xpath = "//*[contains(text(),'Forgot your password?')]")
    WebElement forgotYourPassword;
}
