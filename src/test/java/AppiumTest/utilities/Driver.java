package AppiumTest.utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

        private static AndroidDriver<AndroidElement> driver;

        public static AndroidDriver<AndroidElement> getDriver(){
            if (driver==null){
                String platform = ConfigurationReader.get("platform");
                DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                switch (platform){
                    case "android":

                        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2");
                        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
                        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\alkan\\IdeaProjects\\Appium\\src\\app\\apidemos.apk");
                        try {
                            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        }catch (MalformedURLException e){
                            e.printStackTrace();
                        }
                        break;
                }
            }
            return driver;
        }

        public static void closeDriver() {
            if (driver!=null){
                driver.quit();
                driver=null;
            }
        }
    }

