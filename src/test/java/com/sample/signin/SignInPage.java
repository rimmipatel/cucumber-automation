package com.sample.signin;

import com.sample.base.Page;
import com.sample.base.WebDriverWrapper;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.support.PageFactory.initElements;

public class SignInPage extends Page {

    private final SignInPageElements elements = initElements(wrapper.driver, SignInPageElements.class);

    public SignInPage(WebDriverWrapper wrapper) {
        super(wrapper);
    }

    public void signInPageShouldBeVisible() {
        waitUntilVisible(elements.continueWithEmail);
        assertThat(elements.continueWithEmail.isDisplayed(), equalTo(true));
    }

    public void enterEmailID(String emailId) {
        elements.emailAddress.sendKeys(emailId);
    }

    public void clickContinueWithEmail() {
        elements.continueWithEmail.click();
    }

    public void enterPassword(String pwd) {
        elements.password.sendKeys(pwd);
    }

    public void clickLogIn() {
        elements.logIn.click();
    }
}
