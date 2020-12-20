package com.sample.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {

    @FindBy(css = ".icon-action-more")
    WebElement topMenuUserBar;

    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    WebElement logOut;
}
