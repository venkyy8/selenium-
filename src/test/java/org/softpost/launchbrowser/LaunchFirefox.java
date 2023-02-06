package org.softpost.launchbrowser;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Sagar on 14-01-2017.
 */
public class LaunchFirefox {

    @Test
    public void testLaunch(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Sagar\\Softwares\\geckodriver-v0.11.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.softpost.org");
        driver.close();
        driver.quit();
    }
}
