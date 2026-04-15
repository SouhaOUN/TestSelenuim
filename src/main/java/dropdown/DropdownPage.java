package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    // WebDriver instance to interact with the browser
    WebDriver driver;

    // Constructor to initialize the driver
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    // Locator for the dropdown element (by id)
    private By dropdown = By.id("dropdown");

    /**
     * Selects an option from the dropdown using visible text
     * @param option The visible text of the option to select
     * @return The selected option (for verification if needed)
     */
    public String selectOptionFromDropdown(String option){
        // Create Select object for handling dropdown
        Select dropdownelement = new Select(driver.findElement(dropdown));

        // Select option by visible text
        dropdownelement.selectByVisibleText(option);

        // Return selected option
        return option;
    }

    /**
     * Gets the currently selected option from the dropdown
     * @return The visible text of the selected option
     */
    public String getSelectedOption(){
        // Create Select object again to access current selection
        Select dropdownelement = new Select(driver.findElement(dropdown));

        // Return the text of the first selected option
        return dropdownelement.getFirstSelectedOption().getText();
    }
}