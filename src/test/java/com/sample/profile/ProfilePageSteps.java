package com.sample.profile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProfilePageSteps {

    private final ProfilePage profilePage;

    public ProfilePageSteps(ProfilePage profilePage) {
        this.profilePage = profilePage;
    }

    @Then("website: {string} should be visible on profile page")
    public void websiteShouldBeVisibleOnProfilePage(String website) {
        profilePage.websiteShouldBeVisible(website);
    }

    @And("bio: {string} should be visible on profile page")
    public void bioShouldBeVisibleOnProfilePage(String bio) {
        profilePage.bioShouldBeVisible(bio);
    }
}
