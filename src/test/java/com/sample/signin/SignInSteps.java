package com.sample.signin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps {

    private final SignInPage signInPage;

    public SignInSteps(SignInPage signInPage) {
        this.signInPage = signInPage;

    }

    @Then("user should see sign in page")
    public void userShouldSeeSignInPage() {
        signInPage.signInPageShouldBeVisible();
    }


    @When("user enters email: {string} on sign in page")
    public void userEntersEmailOnSignInPage(String emailId) {
        signInPage.enterEmailID(emailId);
    }

    @And("user clicks on continue with email button on sign in page")
    public void userClicksOnContinueWithEmailButtonOnSignInPage() {
        signInPage.clickContinueWithEmail();
    }

    @And("user enters password: {string} on sign in page")
    public void userEntersPasswordOnSignInPage(String pwd) {
        signInPage.enterPassword(pwd);
    }

    @And("user clicks on log in button on sign in page")
    public void userClicksOnLogInButtonOnSignInPage() {
        signInPage.clickLogIn();
    }
}
