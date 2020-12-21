package com.sample.main;

import com.sample.base.Page;
import com.sample.base.WebDriverWrapper;

import static org.openqa.selenium.support.PageFactory.initElements;

public class MainPage extends Page {

    private final MainPageElements elements = initElements(wrapper.driver, MainPageElements.class);

    public MainPage(WebDriverWrapper wrapper) {
        super(wrapper);
    }

    public void openMainPage() {
        wrapper.driver.get(wrapper.inputArguments.url);
        shouldBeVisible(elements.signUpOrLogIn);
    }

    public void acceptPrivacyPolicy() {
        click(elements.acceptAll);
    }

    public void clickSignUpOrLogIn() {
        click(elements.signUpOrLogIn);
    }
}