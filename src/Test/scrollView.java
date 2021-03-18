package Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class scrollView extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=Capabilities("emulator");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Dimension size=driver.manage().window().getSize();
//        int x=size.getWidth() / 2;
//        int startY=(int) (size.getHeight() * 0.60);
//        int endY=(int) (size.getHeight() * 0.10);
//        driver.swipe(x,startY,endY,2000);
        new TouchAction(driver)
                .press(PointOption.point(550, 640))
                .waitAction().moveTo(PointOption.point(550, 60)).release().perform();
         driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
//         driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(text(\"Radio Group\")))");
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Radio Group\").instance(0))").click();
    }

}
