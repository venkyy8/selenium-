package org.softpost.basicautomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sagar on 14-01-2017.
 */
public class TestBasicOperations {

    @Test
    public void testLaunch() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sagar\\Downloads\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //resizing the window
        driver.manage().window().setSize(new Dimension(400,400));

        Thread.sleep(2000);
        //set the position of the window
        driver.manage().window().setPosition(new Point(200,200));

        driver.get("http://www.softpost.org");

        String source = driver.getPageSource();
        System.out.println("Page source is -> " + source);

        String title = driver.getTitle();
        System.out.println("Page title is -> " + title);

        String url = driver.getCurrentUrl();
        System.out.println("Page url is -> " + url);


        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();

        driver.close();
        driver.quit();
    }
}
