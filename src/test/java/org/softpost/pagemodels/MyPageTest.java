package org.softpost.pagemodels;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sagar on 22-01-2017.
 */
public class MyPageTest {

    @Test
    public void test1() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");

        Page1 page1 = new Page1(driver);
        page1.setUserName("abc");

        driver.close();
        driver.quit();

    }

    @Test
    public void test2() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        Page2 page2 = new Page2(driver);
        page2.setUserName("abc");

        driver.close();
        driver.quit();

    }
}
