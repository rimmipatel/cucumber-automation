package com.sample.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {

    @FindBy(css = ".c-page-index__indicator--user")
    WebElement topMenuUserBar;
}
