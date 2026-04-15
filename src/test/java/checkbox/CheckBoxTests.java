package checkbox;

import base.BaseTests;
import dropdown.DropdownPage;
import home.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends BaseTests {
    @Test
    public void testCheckBox() {

        // 🔹 Navigation vers la page checkbox
        HomePage homePage = new HomePage(driver);
        CheckBoxPage checkBoxPage = homePage.clickCheckBoxLink();

        // 🔹 Vérification état initial
        Assert.assertFalse(checkBoxPage.isChecked(0), "Checkbox 1 doit être décochée au départ");
        Assert.assertTrue(checkBoxPage.isChecked(1), "Checkbox 2 doit être cochée au départ");

        // 🔹 Actions
        checkBoxPage.clickCheckBox(0); // cocher checkbox 1
        checkBoxPage.clickCheckBox(1); // décocher checkbox 2

        // 🔹 Vérification finale
        Assert.assertTrue(checkBoxPage.isChecked(0), "Checkbox 1 doit être cochée après clic");
        Assert.assertFalse(checkBoxPage.isChecked(1), "Checkbox 2 doit être décochée après clic");
    }
}
