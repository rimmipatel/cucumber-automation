package com.sample.home;

import io.cucumber.java.en.Then;

public class HomePageSteps {

    private final HomePage homePage;

    public HomePageSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Then("user should see home page")
    public void userShouldSeeHomePage() {
        homePage.homePageShouldBeVisible();
    }
}
