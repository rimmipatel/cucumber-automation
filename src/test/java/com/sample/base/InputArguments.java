package com.sample.base;

import java.io.IOException;
import java.util.Properties;

public class InputArguments {

    private static final String DEFAULT_PROPERTIES_FILE = "default.properties";
    private static final String KEY_BROWSER = "browser";
    private static final String KEY_URL = "url";

    public final BrowserType browserType;
    public final String url;

    public InputArguments(BrowserType browserType, String url) {
        this.browserType = browserType;
        this.url = url;
    }

    public static InputArguments create() {
        try {
            Properties defaults = new Properties();
            defaults.load(InputArguments.class.getClassLoader().getResourceAsStream(DEFAULT_PROPERTIES_FILE));

            BrowserType browserType = BrowserType.from(getProperty(defaults, KEY_BROWSER));
            String url = getProperty(defaults, KEY_URL);

            return new InputArguments(browserType, url);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private static String getProperty(Properties defaults, String key) {
        String value = System.getProperty(key);
        if (value != null) {
            return value;
        }

        value = defaults.getProperty(key);
        if (value != null) {
            return value;
        }

        throw new IllegalArgumentException("Missing parameter '" + key + "'");
    }
}


