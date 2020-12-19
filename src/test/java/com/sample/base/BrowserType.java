package com.sample.base;

import java.util.Arrays;

public enum BrowserType {
    CHROME,
    FIREFOX,
    EDGE,
    IE;

    public static BrowserType from(String value) {
        try {
            return BrowserType.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            String msg = "Invalid value '" + value + "' for browser. Possible values are "
                    + Arrays.toString(BrowserType.values());
            throw new IllegalArgumentException(msg, e);
        }
    }
}
