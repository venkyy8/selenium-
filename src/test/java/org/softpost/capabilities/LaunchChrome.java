package org.softpost.capabilities;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sagar on 14-01-2017.
 */
public class LaunchChrome {

    @Test
    public void testLaunch(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        //using chrome binary from specific location
        //options.setBinary("/path/to/other/chrome/binary");

        //Setting the chrome profile
        //chrome://version
        //options.addArguments("user-data-dir=C:\\Users\\Sagar\\AppData\\Local\\Google\\Chrome\\User Data");

        //to disable pop up blocking
        options.addArguments("disable-popup-blocking");

        //To start chrome without security warning
       // options.addArguments("test-type");

        //To start the chrome in Maximized mode
        options.addArguments("start-maximized");

        //Adding extensions to chrome
        //C:\Users\Sagar\AppData\Local\Google\Chrome\User Data\Default\Extensions
        //options.addExtensions(new File("C:\\Users\\Sagar\\Softwares\\Google extensions\\14.1_0.crx"));

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.popuptest.com/popuptest2.html");
        driver.close();
        driver.quit();
    }
}
