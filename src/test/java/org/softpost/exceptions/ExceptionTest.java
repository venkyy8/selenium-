package org.softpost.exceptions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sagar on 21-01-2017.
 */
public class ExceptionTest {

    @Test
    public void testLaunch(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/index.php");
        driver.findElement(By.xpath("jk]")).click();
        //driver.switchTo().frame("sdsd");
        driver.close();
        driver.quit();
    }
}
