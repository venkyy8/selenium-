package org.softpost.windows;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sagar on 21-01-2017.
 */
public class TestAlert {


    @Test
    public void testLaunch() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize
        driver.manage().window().maximize();

        driver.get("http://www.softpost.org/selenium-test-page/");
        driver.findElement(By.name("Sign up")).click();

        Thread.sleep(2000);
        driver.switchTo().alert().accept();



        driver.close();
        driver.quit();
    }
}
