package com.sample.home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    private final HomePage homePage;

    public HomePageSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Then("user should see home page")
    public void userShouldSeeHomePage() {
        homePage.homePageShouldBeVisible();
    }

    @When("user clicks more menu")
    public void userClicksMoreMenu() {
        homePage.clickMoreMenu();
    }

    @When("user goes to profile setting")
    public void userGoesToProfileSetting() {
        homePage.clickMoreMenu();
        homePage.clickSettings();
    }

    @And("user goes to his profile")
    public void userGoesToHisProfile() {
        homePage.clickProfileName();
        homePage.clickYourProfile();
    }

    @And("user navigates to home page")
    public void userNavigatesToHomePage() {
        homePage.clickHomeLogo();
    }
}
