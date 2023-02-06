package org.softpost.launchbrowser;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class LaunchPhantomJs {

    @Test
    public void testLaunch(){
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://www.softpost.org");
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();
    }
}
