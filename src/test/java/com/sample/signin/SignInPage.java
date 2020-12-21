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
        shouldBeVisible(elements.continueWithEmail);
    }

    public void enterEmail(String emailId) {
        sendKeys(elements.emailAddress, emailId);
    }

    public void clickContinueWithEmail() {
        click(elements.continueWithEmail);
    }

    public void enterPassword(String pwd) {
        sendKeys(elements.password, pwd);
    }

    public void clickLogIn() {
        click(elements.logIn);
    }

    public void errorMessageForInvalidCredentialShouldBeVisible() {
        shouldBeVisible(elements.errorMessage);
    }

    public void clickForgotYourPassword() {
        click(elements.forgotYourPassword);
    }
}
