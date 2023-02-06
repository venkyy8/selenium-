package org.softpost;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class SandpitTest {

    @Test
    public void test1(){

        System.out.println("Hello");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Sagar\\Softwares\\geckodriver-v0.11.0-win64\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://www.softpost.org");
        driver.close();
        driver.quit();
    }

}
