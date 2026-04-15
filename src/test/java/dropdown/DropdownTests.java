package dropdown;

import base.BaseTests;
import home.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

    @Test
    public void testDropDown(){

        // Navigate to Home Page
        HomePage homePage = new HomePage(driver);

        // Click on dropdown link and navigate to Dropdown Page
        DropdownPage dropdownPage = homePage.clickDropDownLink();

        // Define the option to select
        String option = "Option 1";

        // Select the option from dropdown
        String expectedOption = dropdownPage.selectOptionFromDropdown(option);

        // Get the actually selected option from UI
        String selectedOption = dropdownPage.getSelectedOption();

        // Validate that the selected option matches expected
        Assert.assertEquals(selectedOption, expectedOption, "Incorrect selection");
    }
}