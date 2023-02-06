package org.softpost.synchronization;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sagar on 21-01-2017.
 */
public class SynchTest {


    @Test
    public void testLaunch() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        Thread.sleep(2000);
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.findElement(By.name("password")).sendKeys("tutorial");


        new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs("Welcome: Mercury Tours"));
        WebElement userName = new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.name("userName1")));


        driver.close();
        driver.quit();

    }
}
