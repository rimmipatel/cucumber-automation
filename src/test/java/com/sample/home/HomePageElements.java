package com.sample.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {

    @FindBy(css = ".icon-action-more")
    WebElement moreMenu;

    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    WebElement logOut;

    @FindBy(xpath = "//a[contains(text(),'Settings')]")
    WebElement settings;

    // TODO Find better locator for profile name
    @FindBy(xpath = "//*[contains(text(),'John Doe')]")
    WebElement profileName;

    @FindBy(xpath = "//a[contains(text(),'Your Profile')]")
    WebElement yourProfile;

    @FindBy(xpath = "//a[contains(text(),'komoot')]")
    WebElement homeLogo;
}
