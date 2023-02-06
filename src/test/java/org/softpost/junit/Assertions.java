package org.softpost.junit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sagar on 22-01-2017.
 */
public class Assertions {

    @Test
    public void verifyTitle(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.softpost.org");
        String title = driver.getTitle();
        Assert.assertEquals("This is a title check","Free Software Tutorials | Grab software concepts for free here!",title);
        Assert.assertFalse(22==23);
        driver.close();
        driver.quit();
    }
}
