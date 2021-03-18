package Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HybridApp {
    public static void main(String[] args) throws MalformedURLException {
        File fs=new File("src");
//        File fd=new File(fs,"Haiburoido hybrid test app_v1.3_apkpure.com.apk");
        File fd=new File(fs,"twitter.apk");

        DesiredCapabilities des=new DesiredCapabilities();
        des.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//        des.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        des.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_29");
        des.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"100");
        des.setCapability(MobileCapabilityType.APP, fd.getAbsolutePath());
        des.setCapability("appPackage", "com.twitter.android");
        des.setCapability("appActivity","com.twitter.android.StartActivity");
        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        System.out.println(driver.getContext());
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Log in')]")).click();
        //        driver.findElement(By.id("com.hybridapptest.forandroid:id/et_url")).sendKeys("www.google.com");
//        driver.findElement(By.id("com.hybridapptest.forandroid:id/btn_move")).click();
        Set<String> s=driver.getContextHandles();
        for (String handle: s){
            System.out.println(handle);
        }
//        driver.context("WEBVIEW_chrome");
        driver.findElement(By.id("com.twitter.android:id/login_identifier")).sendKeys("ptailor@bosleo.com");
        driver.findElement(By.id("com.twitter.android:id/login_password")).sendKeys("bosleo@2021");
        driver.findElement(By.id("com.twitter.android:id/login_login")).click();
        System.out.println(driver.getContext());
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.findElementByXPath("android.widget.TextView[@text='Profile']").click();
        System.out.println(driver.getContext());


    }
}
