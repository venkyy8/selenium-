package org.softpost.capabilities;

import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchPhantomJs {

    @Test
    public void testLaunch(){

        Capabilities caps = new DesiredCapabilities();
        ((DesiredCapabilities) caps).setJavascriptEnabled(true);
        ((DesiredCapabilities) caps).setCapability("takesScreenshot", true);
        ((DesiredCapabilities) caps).setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                "C:\\Users\\Sagar\\Softwares\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe"
        );

        WebDriver   driver = new  PhantomJSDriver(caps);
        driver.get("http://www.softpost.org");
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();
    }
}
