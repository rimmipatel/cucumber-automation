package com.sample.signin;

import com.sample.base.Page;
import com.sample.base.WebDriverWrapper;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ResetPasswordPage extends Page {

    private final ResetPasswordElements elements = initElements(wrapper.driver, ResetPasswordElements.class);

    public ResetPasswordPage(WebDriverWrapper wrapper) {
        super(wrapper);
    }

    public void resetPasswordPageShouldBeVisible() {
        shouldBeVisible(elements.sendNewPassword);
    }

    public void enterEmail(String email) {
        elements.email.sendKeys(email);
    }

    public void clickSendNewPassword() {
        elements.sendNewPassword.click();
    }

    public void successfulPasswordResetMessageShouldBeVisible() {
        shouldBeVisible(elements.successfulPasswordResetMessage);
    }
}
