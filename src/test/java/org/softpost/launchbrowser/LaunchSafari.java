package org.softpost.launchbrowser;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by Sagar on 14-01-2017.
 */
public class LaunchSafari {

    @Test
    public void testLaunch(){
        WebDriver driver = new SafariDriver();
        driver.get("http://www.softpost.org");
        driver.close();
        driver.quit();
    }
}
