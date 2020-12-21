package com.sample.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePageElements {
    // TODO Find better locators for bio and website
    @FindBy(xpath = "//*[contains(text(), 'This is my bio')]/parent::p")
    WebElement bio;

    @FindBy(xpath = "//a[contains(text(), 'example.com')]/parent::p")
    WebElement website;
}
