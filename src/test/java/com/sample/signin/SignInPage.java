package com.sample.signin;

import com.sample.base.Page;
import com.sample.base.WebDriverWrapper;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SignInPage extends Page {

    private final SignInPageElements elements = initElements(wrapper.driver, SignInPageElements.class);

    public SignInPage(WebDriverWrapper wrapper) {
        super(wrapper);
    }

    public void signInPageShouldBeVisible() {
        waitUntilVisible(elements.continueWithEmail);
        shouldBeVisible(elements.continueWithEmail);
    }

    public void enterEmail(String emailId) {
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

    public void clickForgotYourPassword() {
        elements.forgotYourPassword.click();
    }
}
