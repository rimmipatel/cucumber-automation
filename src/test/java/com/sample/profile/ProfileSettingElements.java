package com.sample.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileSettingElements {

    @FindBy(id = "website")
    WebElement website;

    @FindBy(id = "about")
    WebElement bio;

    @FindBy(xpath = "//*[contains(text(),'Save')]")
    WebElement saveBio;
}
