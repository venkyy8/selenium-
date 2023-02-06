package org.softpost.pagemodels;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sagar on 22-01-2017.
 */
public class Page2 {

    WebDriver driver;
    Page2(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "userName" )
    WebElement userName;



    public void setUserName(String name){
        userName.sendKeys(name);
    }
}
