package org.softpost.launchbrowser;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by Sagar on 14-01-2017.
 */
public class LaunchEdge {

    @Test
    public void testLaunch(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\Sagar\\Softwares\\MicrosoftWebDriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.softpost.org");
        driver.close();
        driver.quit();
    }
}
