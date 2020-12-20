package com.sample.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public abstract class Page {

    protected final WebDriverWrapper wrapper;

    public Page(WebDriverWrapper wrapper) {
        this.wrapper = wrapper;
    }

    protected void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(wrapper.driver, Timeout.DEFAULT_SECONDS);
        wait.until(visibilityOf(element));
    }

    protected void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(wrapper.driver, Timeout.DEFAULT_SECONDS);
        wait.until(elementToBeClickable(element));
    }

    protected void shouldBeVisible(WebElement element) {
        assertThat(element.isDisplayed(), equalTo(true));
    }
}
