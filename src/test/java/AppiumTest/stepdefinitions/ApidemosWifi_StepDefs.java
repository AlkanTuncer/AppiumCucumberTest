package AppiumTest.stepdefinitions;

import AppiumTest.pages.ApidemosWifiPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApidemosWifi_StepDefs {

    ApidemosWifiPage apidemosWifiPage = new ApidemosWifiPage();

    @Given("Preference tıklanır")
    public void preference_tıklanır() {
        apidemosWifiPage.preference.click();
    }

    @Then("Preference dependencies tıklanır")
    public void preference_dependencies_tıklanır() {
        apidemosWifiPage.preferenceDependencies.click();
    }
    @Then("WiFi check box aktif edilir.")
    public void wifi_check_box_aktif_edilir() {
        apidemosWifiPage.wifiCheckBox.click();
    }
    @Then("Wifi Settings tıklanır")
    public void wifi_Settings_tıklanır() {
        apidemosWifiPage.wifiSettings.click();
    }
    @Then("Gelen ekrana {string} yazılır ve OK tıklanır")
    public void gelen_ekrana_yazılır_ve_OK_tıklanır(String appium) {
        apidemosWifiPage.textBox.sendKeys(appium);
        apidemosWifiPage.okButton.click();
    }

}
