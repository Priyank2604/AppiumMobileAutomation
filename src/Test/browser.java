package Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class browser extends baseChrome{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=Capabilities("real");
//        driver.get("http://facebook.com");
//        driver.findElementByXPath("//*[@id=\"m_login_email\"]").sendKeys("bvaidya@bosleo.com");
//        driver.findElementByXPath("//*[@id=\"m_login_password\"]").sendKeys("bosleo123");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElementByXPath("//button[@value='Log In']").click();
        driver.get("https://m.cricbuzz.com/");
        driver.findElementByXPath("//*[@id=\"top\"]/div/div[3]/div[2]/a").click();
        driver.findElementByXPath("//*[@id=\"top\"]/div/div[12]/table/tbody/tr[1]/td[1]/a").click();
        System.out.println(driver.getCurrentUrl());
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)","");
    Assert.assertTrue(driver.findElementByXPath("//*[@id=\"top\"]/div/div[8]/h4").getAttribute("class").contains("header"));
    }
}
