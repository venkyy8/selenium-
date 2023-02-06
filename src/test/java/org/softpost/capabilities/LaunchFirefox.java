package org.softpost.capabilities;

import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

/**
 * Created by Sagar on 14-01-2017.
 */
public class LaunchFirefox {

    @Test
    public void testLaunch(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Sagar\\Softwares\\geckodriver-v0.11.0-win64\\geckodriver.exe");
/*
        //C:\Program Files (x86)\Mozilla Firefox
        //To know the profile, you can use firefox -p command
        FirefoxProfile ffprofile = new ProfilesIni().getProfile("default");
        WebDriver driver = new FirefoxDriver(ffprofile);
*/

        FirefoxBinary ffBinary = new FirefoxBinary(new File("c:\\FirefoxPortable_p.exe"));
        WebDriver driver = new FirefoxDriver(ffBinary,new FirefoxProfile());

        driver.get("http://www.softpost.org");
        driver.close();
        driver.quit();
    }
}
