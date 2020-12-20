package com.sample.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageElements {

    @FindBy(xpath = "//*[contains(text(),'Sign up or log in')]")
    WebElement signUpOrLogIn;

    @FindBy(xpath = "//*[contains(text(),'Accept All')]")
    WebElement acceptAll;
}
