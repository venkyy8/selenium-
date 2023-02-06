package org.softpost.complexactions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Sagar on 21-01-2017.
 */
public class ComplexActionTest {


    @Test
    public void testLaunch() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");

        //find the element with id - fn
        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("tutorial");

        new Actions(driver).contextClick(userName).build().perform();
        new Actions(driver).moveToElement(userName).click(userName).build().perform();

        new Actions(driver).doubleClick(userName);


       // new Actions(driver).moveToElement(userName).click(userName).build().perform();
        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }
}
