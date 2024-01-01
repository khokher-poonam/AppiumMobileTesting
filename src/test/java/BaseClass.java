import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
AppiumDriver<MobileElement> driver;
    @BeforeTest
    public void setup()
    {

        try
        {
            DesiredCapabilities caps=new DesiredCapabilities();

//            String platform="android";
//            if(platform.equalsIgnoreCase("android")) {
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//                caps.setCapability(MobileCapabilityType.UDID, "465954ab");
//                caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
                caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//            } else if (platform.equalsIgnoreCase("ios")) {
//
//                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
//                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "17.1.2");
//                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iphone 13");
//                caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
//            }
            URL url  =new URL("http://127.0.0.1:4723/wd/hub");
             driver=new AppiumDriver<MobileElement>(url,caps);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (Exception exp) {
System.out.println("cause is:"+exp.getCause());
            System.out.println("Message is:"+exp.getMessage());
            exp.printStackTrace();
    }
    }


}
