package Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class basics extends base{
//    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Preference\")") WebElement el1;

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver=Capabilities("emulator");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//       String el="Preference";
       driver.findElementByXPath("//android.widget.TextView[normalize-space(@text)='Preference']").click();
//        el1.click();

    }
}