package largedeepdom;

import base.BaseTests;
import home.HomePage;
import org.testng.annotations.Test;

public class LargeDeepDomTests extends BaseTests {

    @Test
    public void testScrollIntoTable() {

        HomePage homePage = new HomePage(driver);
        LargeDeepDomPage deepDom = homePage.clickLargeDeepDomLink();

        deepDom.scrollIntoTable();
    }
}