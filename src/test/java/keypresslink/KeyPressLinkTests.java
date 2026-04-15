package keypresslink;

import base.BaseTests;
import home.HomePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressLinkTests extends BaseTests {
@Test
    public void KeyPressLink(){

        HomePage homePage= new HomePage(driver);
        KeyPressLinkPage keyPresslinkPage = homePage.clickKeyPressLink();

      Keys[] KeysToTest = { Keys.TAB , Keys.SPACE, Keys.ESCAPE ,Keys.BACK_SPACE};

        for (Keys keys : KeysToTest) {
            keyPresslinkPage.EnterText(keys);
            String expected= "You entered: " +keys.name();
            System.out.println(expected);
            String attendu = keyPresslinkPage.GetResult();
            System.out.println(attendu);
            Assert.assertEquals(attendu ,expected , "input invalide");
        }




    }
}
