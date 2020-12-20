package com.sample.signin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPasswordElements {

    @FindBy(xpath = "//*[contains(text(),'Send New Password')]")
    WebElement sendNewPassword;

    @FindBy (id="email")
    WebElement email;

    @FindBy(xpath = "//*[contains(text(),'Your Password Has Been Reset')]")
    WebElement successfulPasswordResetMessage;
}
