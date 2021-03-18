package Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class base {
//    public base(){
//        super();
//    }
    public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException{
        AndroidDriver<AndroidElement> driver;
        File fs=new File("src");
        File fd=new File(fs,"ApiDemos-debug.apk");
        DesiredCapabilities cap=new DesiredCapabilities();
        /*
         To install and run application in emulator
         */
        if(device.equals("emulator")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_29");
        }else if(device.equals("real")) {
        /*
        To install and run application in real device
         */
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }
        cap.setCapability(MobileCapabilityType.APP, fd.getAbsolutePath());
        driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    return driver;
    }
}
