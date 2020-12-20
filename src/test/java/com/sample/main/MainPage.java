package com.sample.main;

import com.sample.base.Page;
import com.sample.base.WebDriverWrapper;

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

    public void acceptPrivacyPolicy() {
        waitUntilClickable(elements.acceptAll);
        elements.acceptAll.click();
    }

    public void clickSignUpOrLogIn() {
        waitUntilClickable(elements.signUpOrLogIn);
        elements.signUpOrLogIn.click();
    }
}