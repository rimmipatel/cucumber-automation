package com.sample.main;

import com.sample.base.Page;
import com.sample.base.WebDriverWrapper;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.support.PageFactory.initElements;

public class MainPage extends Page {

    private final MainPageElements elements = initElements(wrapper.driver, MainPageElements.class);

    public MainPage(WebDriverWrapper wrapper) {
        super(wrapper);
    }

    public void openMainPage() {
        wrapper.driver.get(wrapper.inputArguments.url);
        assertThat(elements.signUpOrLogIn.isDisplayed(), equalTo(true));
    }

    public void clickSignUpOrLogIn() {
        // For some reason sign up button on komoot.com is not responding to single click.
        // Using double click action as a temporary fix.
        new Actions(wrapper.driver)
                .moveToElement(elements.signUpOrLogIn)
                .doubleClick(elements.signUpOrLogIn)
                .build()
                .perform();
    }
}