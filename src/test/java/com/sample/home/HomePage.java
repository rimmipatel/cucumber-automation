package com.sample.home;

import com.sample.base.Page;
import com.sample.base.WebDriverWrapper;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.support.PageFactory.initElements;

public class HomePage extends Page {

    private final HomePageElements elements = initElements(wrapper.driver, HomePageElements.class);

    public HomePage(WebDriverWrapper wrapper) {
        super(wrapper);
    }

    public void homePageShouldBeVisible() {
        waitUntilVisible(elements.topMenuUserBar);
        assertThat(elements.topMenuUserBar.isDisplayed(), equalTo(true));
    }
}
