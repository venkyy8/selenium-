package org.softpost.windows;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

/**
 * Created by Sagar on 21-01-2017.
 */
public class WindowTest {



    @Test
    public void testLaunch() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize
        driver.manage().window().maximize();

        driver.get("http://www.softpost.org");
        System.out.println( "Home page window handle " + driver.getWindowHandle());
        String oh = driver.getWindowHandle();

        driver.findElement(By.linkText("Java")).click();

        System.out.println( "Home page window handle " + driver.getWindowHandle());

        Set<String> handles = driver.getWindowHandles();

        System.out.println("Size of handles " + handles.size());
        System.out.println(driver.getTitle());
        for (String h : handles)
        {
            System.out.println("handles -> " + h);
            if (!h.equalsIgnoreCase(oh)){
                driver.switchTo().window(h);
            }
        }
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();

    }
}
