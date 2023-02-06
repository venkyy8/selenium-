package org.softpost.js;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sagar on 21-01-2017.
 */
public class TestJs {


    @Test
    public void testLaunch() throws  Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.softpost.org");

        //arguments[0].value="sdsd"

        WebElement element = driver.findElement(By.linkText("Java"));

        String source = (String)((JavascriptExecutor) driver).executeScript("return document.body.innerHTML;");
        System.out.println(source);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",element);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",element);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");

        String event = "var evt = document.createEvent('HTMLEvents');";
        event = event + "evt.initEvent('change');";
        event = event + "arguments[0].dispatchEvent(evt);";

        ((JavascriptExecutor) driver).executeScript(event,element);
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
