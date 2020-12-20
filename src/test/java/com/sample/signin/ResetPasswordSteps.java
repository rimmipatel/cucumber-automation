package com.sample.signin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResetPasswordSteps {

    private final ResetPasswordPage resetPasswordPage;

    public ResetPasswordSteps(ResetPasswordPage resetPasswordPage) {
        this.resetPasswordPage = resetPasswordPage;
    }

    @Then("user should see reset password page")
    public void userShouldSeeResetPasswordPage() {
        resetPasswordPage.resetPasswordPageShouldBeVisible();
    }

    @When("user enters valid email: {string} to reset password")
    public void userEntersValidEmailToResetPassword(String email) {
        resetPasswordPage.enterEmail(email);
    }

    @And("user clicks send new password")
    public void userClicksSendNewPassword() {
        resetPasswordPage.clickSendNewPassword();
    }

    @Then("user should see successful password reset message")
    public void userShouldSeeSuccessfulPasswordResetMessage() {
        resetPasswordPage.successfulPasswordResetMessageShouldBeVisible();
    }
}
