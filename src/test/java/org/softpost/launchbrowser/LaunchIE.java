package org.softpost.launchbrowser;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Sagar on 14-01-2017.
 */
public class LaunchIE {

    @Test
    public void testLaunch(){
        System.setProperty("webdriver.ie.driver","C:\\Users\\Sagar\\Softwares\\IEDriverServer_x64_3.0.0\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://www.softpost.org");
        driver.close();
        driver.quit();
    }
}
