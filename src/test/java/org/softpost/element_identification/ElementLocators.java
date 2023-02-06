package org.softpost.element_identification;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sagar on 21-01-2017.
 */
public class ElementLocators {


    @Test
    public void testLaunch() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.get("http://www.softpost.org/selenium-test-page/");

        //find the element with id - fn
        driver.findElement(By.id("fn")).sendKeys("hello");

        //find the element with class - entry-title
        String title = driver.findElement(By.className("entry-title")).getText();
        System.out.println("Title of the page is -> " + title);

        Thread.sleep(4000);
        //find the element with name - gender
        driver.findElement(By.name("gender")).click();

        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("last name");

        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        //driver.findElement(By.tagName("input")).sendKeys("user");

        driver.findElement(By.linkText("Flights")).click();
        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("Hot")).click();
        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }
}
