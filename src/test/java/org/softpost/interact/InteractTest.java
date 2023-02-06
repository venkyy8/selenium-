package org.softpost.interact;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Sagar on 21-01-2017.
 */
public class InteractTest {


    @Test
    public void testLaunch() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize
        driver.manage().window().maximize();

        new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs("Yahoo News"));
        Thread.sleep(2000);
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");

        //find the element with id - fn
        WebElement userName = driver.findElement(By.name("userName1"));
        userName.sendKeys("tutorial");
        driver.findElement(By.name("password")).sendKeys("tutorial");

        String name = userName.getAttribute("value");
        System.out.println( "User name is -> " + name);

        driver.findElement(By.name("login")).click();
        driver.findElement(By.xpath("//input[@value='oneway']")).click();

        //drop down
        WebElement pass = driver.findElement(By.name("passCount"));
        new Select(pass).selectByVisibleText("2");

        //get values from edit box and drop downs
        String passengerCount = new Select(pass).getFirstSelectedOption().getText();
        System.out.println("Passenger count -> " + passengerCount);

        WebElement serviceClass = driver.findElement(By.xpath("//input[@value='Coach']"));
        boolean selected = serviceClass.isSelected();
        boolean enabled = serviceClass.isEnabled();
        boolean displayed = serviceClass.isDisplayed();

        System.out.println(selected + " " +  enabled + " " + displayed);

        String data = driver.findElement(By.xpath("//form//td")).getText();
        if (data.toLowerCase().contains("flight detail"))
        {
            System.out.println("I found flight details");
        }else{
            System.out.println("I did not find flight details");
        }
        driver.findElement(By.name("findFlights")).click();

        driver.close();
        driver.quit();

    }
}
