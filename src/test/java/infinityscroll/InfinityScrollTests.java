package infinityscroll;

import base.BaseTests;
import home.HomePage;
import infinitscroll.InfinitScrollPage;
import org.testng.annotations.Test;

public class InfinityScrollTests extends BaseTests {
@Test
    public void testInfinityScrollTests(){
        HomePage homePage = new HomePage(driver);
        InfinitScrollPage infinitScrollPage = homePage.clickInfinitScrollLink();
        infinitScrollPage.scrollToParagraph(6);
    }
}
