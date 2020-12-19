package com.sample.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.picocontainer.Disposable;

import java.util.concurrent.TimeUnit;

/**
 * New instance of this class will be created for each cucumber scenario. It will be injected automatically by
 * picocontainer in the constructor of page object class.{{@link WebDriverWrapper#dispose()}} method will be called
 * automatically after each scenario.
 */
public class WebDriverWrapper implements Disposable {

    public final WebDriver driver;

    public WebDriverWrapper() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Timeout.DEFAULT_SECONDS, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.komoot.com/");
    }

    @Override
    public void dispose() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
