package com.sample.main;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MainPageSteps {

    private final MainPage mainPage;

    public MainPageSteps(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    @Given("user is on landing page")
    public void userIsOnLandingPage() {
        mainPage.openMainPage();
    }

    @When("user clicks sign up or log in button")
    public void userClicksSignUpOrLogInButton() {
        mainPage.clickSignUpOrLogIn();
    }
}
