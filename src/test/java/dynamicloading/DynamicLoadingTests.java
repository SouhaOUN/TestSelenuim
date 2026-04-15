package dynamicloading;

import base.BaseTests;
import home.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testDynamicLoadingTests() {
        HomePage homePage = new HomePage(driver);
        DynamicLoadingPage dynamicLoading = homePage.clickDynamicLoadingLink();
        Exemple1DynamicLoading Exemple1 = dynamicLoading.linkExemple();
        Exemple1.clickStartButton();
        String message = Exemple1.getMessage();
        Assert.assertEquals(message, "Hello World!", "Incorrect Loading");
    }
}
