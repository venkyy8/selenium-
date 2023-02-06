package org.softpost.pagemodels;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sagar on 22-01-2017.
 */
public class Page1 {
  WebDriver driver;

  Page1(WebDriver driver){
     this.driver = driver;
  }

  public void setUserName(String name){
      driver.findElement(By.name("userName")).sendKeys(name);
  }

}
