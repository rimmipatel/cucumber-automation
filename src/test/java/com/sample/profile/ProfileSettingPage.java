package com.sample.profile;

import com.sample.base.Page;
import com.sample.base.WebDriverWrapper;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ProfileSettingPage extends Page {

    private final ProfileSettingElements elements = initElements(wrapper.driver, ProfileSettingElements.class);

    public ProfileSettingPage(WebDriverWrapper wrapper) {
        super(wrapper);
    }

    public void enterWebsite(String website) {
        clear(elements.website);
        sendKeys(elements.website, website);
    }

    public void enterBio(String bio) {
        clear(elements.bio);
        sendKeys(elements.bio, bio);
    }

    public void clickSave() {
        click(elements.saveBio);
    }
}
