package com.sample.main;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MainPageSteps {

    private final MainPage mainPage;

    public MainPageSteps(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    @Given("user is on main page")
    public void userIsOnMainPage() {
        mainPage.openMainPage();
    }

    @When("user clicks sign up or log in button")
    public void userClicksSignUpOrLogInButton() {
        mainPage.clickSignUpOrLogIn();
    }

    @And("user accepts privacy policy")
    public void userAcceptsPrivacyPolicy() {
        mainPage.acceptPrivacyPolicy();
    }
}
