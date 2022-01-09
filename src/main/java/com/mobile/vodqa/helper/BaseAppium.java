package com.mobile.vodqa.helper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseAppium {

    public static AppiumDriver<WebElement> driver;

    public void startAppium() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("PlatformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("deviceName", "36524734474e3098");
        capabilities.setCapability("appPackage", "com.vodqareactnative");
        capabilities.setCapability("appActivity", "com.vodqareactnative.MainActivity");

        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void closeAppium() {
        if (driver != null) {
            driver.closeApp();
            driver.quit();
        }
    }

}
