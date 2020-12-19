package com.sample.base;

public abstract class Page {

    protected final WebDriverWrapper wrapper;

    public Page(WebDriverWrapper wrapper) {
        this.wrapper = wrapper;
    }
}
