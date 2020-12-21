package com.sample.profile;

import com.sample.base.Page;
import com.sample.base.WebDriverWrapper;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ProfilePage extends Page {

    private final ProfilePageElements elements = initElements(wrapper.driver, ProfilePageElements.class);

    public ProfilePage(WebDriverWrapper wrapper) {
        super(wrapper);
    }

    public void websiteShouldBeVisible(String website) {
        shouldBeVisible(elements.website);
        shouldHaveText(elements.website, website);
    }

    public void bioShouldBeVisible(String bio) {
        shouldBeVisible(elements.bio);
        shouldHaveText(elements.bio, bio);
    }
}
