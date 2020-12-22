package com.sample.home;

import com.sample.base.Page;
import com.sample.base.Timeout;
import com.sample.base.WebDriverWrapper;

import static org.openqa.selenium.support.PageFactory.initElements;

public class HomePage extends Page {

    private final HomePageElements elements = initElements(wrapper.driver, HomePageElements.class);

    public HomePage(WebDriverWrapper wrapper) {
        super(wrapper);
    }

    public void homePageShouldBeVisible() {
        shouldBeVisible(elements.moreMenu);
        clickMoreMenu();
        shouldBeVisible(elements.logOut);
    }

    public void clickSettings() {
        waitFor(Timeout.MILLIS_2000);
        click(elements.settings);
    }

    public void clickMoreMenu() {
        waitFor(Timeout.MILLIS_2000);
        click(elements.moreMenu);
    }

    public void clickProfileName() {
        click(elements.profileName);
    }

    public void clickYourProfile() {
        click(elements.yourProfile);
    }

    public void clickHomeLogo() {
        click(elements.homeLogo);
    }
}
