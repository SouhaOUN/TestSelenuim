package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    // WebDriver instance
    WebDriver driver;

    // Locators for alert trigger buttons
    private By triggerAlertButton1 = By.xpath("//button[text()=\"Click for JS Alert\"]");
    private By triggerAlertButton2 = By.xpath("//button[text()=\"Click for JS Confirm\"]");
    private By triggerAlertButton3 = By.cssSelector("button[onclick='jsPrompt()']");

    // Locator for result message displayed after alert interaction
    private By result = By.id("result");

    // Constructor
    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    // Click button to trigger simple alert
    public void clickTriggerAlertButton1(){
        driver.findElement(triggerAlertButton1).click();
    }

    // Click button to trigger confirmation alert (OK / Cancel)
    public void clickTriggerAlertButton2(){
        driver.findElement(triggerAlertButton2).click();
    }

    // Click button to trigger prompt alert (input field)
    public void clickTriggerAlertButton3(){
        driver.findElement(triggerAlertButton3).click();
    }

    // Accept the alert (click OK)
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    // Dismiss the alert (click Cancel)
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    // Get result message displayed on the page after alert interaction
    public String getMessage(){
        return driver.findElement(result).getText();
    }

    // Send text to prompt alert input field
    public void setAlertInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}