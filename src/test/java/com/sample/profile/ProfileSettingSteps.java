package com.sample.profile;

import io.cucumber.java.en.And;

public class ProfileSettingSteps {

    private final ProfileSettingPage profileSettingPage;

    public ProfileSettingSteps(ProfileSettingPage profileSettingPage) {
        this.profileSettingPage = profileSettingPage;
    }

    @And("user enters website: {string} on profile setting page")
    public void userEntersWebsiteOnProfileSettingPage(String website) {
        profileSettingPage.enterWebsite(website);
    }

    @And("user enters bio: {string} profile setting page")
    public void userEntersBioProfileSettingPage(String bio) {
        profileSettingPage.enterBio(bio);
    }

    @And("user clicks on save on profile setting page")
    public void userClicksOnSaveOnProfileSettingPage() {
        profileSettingPage.clickSave();
    }
}
