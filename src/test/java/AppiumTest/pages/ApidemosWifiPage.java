package AppiumTest.pages;

import AppiumTest.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ApidemosWifiPage {

    public ApidemosWifiPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }

    @AndroidFindBy(accessibility = "Preference")
    public WebElement preference;

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    public WebElement preferenceDependencies;

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement wifiCheckBox;

    @AndroidFindBy(xpath = "//*[@text=\"WiFi settings\"]")
    public WebElement wifiSettings;

    @AndroidFindBy(id = "android:id/edit")
    public WebElement textBox;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;

}
