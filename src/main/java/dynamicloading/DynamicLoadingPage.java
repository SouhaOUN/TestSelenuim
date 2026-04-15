package dynamicloading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
 // WebDriver instance used to interact with the browser 
    // WebDriver instance used to interact with the browser
    WebDriver driver;

    // Locator for "Example 1" link on the Dynamic Loading page
    private By exemple1Link = By.cssSelector("[href=\"/dynamic_loading/1\"]");

    // Constructor to initialize driver
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Clicks on the "Example 1" link and navigates to the next page
     *
     * @return Exemple1DynamicLoading page object
     */
    public Exemple1DynamicLoading linkExemple(){

        // Find the link and click it
        driver.findElement(exemple1Link).click();

        // Return the next page object after navigation
        return new Exemple1DynamicLoading(driver);
    }
}