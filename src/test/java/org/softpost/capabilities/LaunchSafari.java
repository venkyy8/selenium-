package org.softpost.capabilities;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

/**
 * Created by Sagar on 14-01-2017.
 */
public class LaunchSafari {

    @Test
    public void testLaunch(){
        SafariOptions options = new SafariOptions();
        options.setUseCleanSession(true);
        WebDriver driver = new SafariDriver(options);
        driver.get("http://www.softpost.org");
        driver.close();
        driver.quit();
    }
}
