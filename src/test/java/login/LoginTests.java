package login;

import base.BaseTests;
import home.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import securearea.SecureAreaPage;

import java.util.List;

public class LoginTests extends BaseTests {
@Test
    public void testSuccessfulLogin(){
        HomePage homePage = new HomePage(driver);

        LoginPage loginpage = homePage.clickFormAuthenticationLink();
        loginpage.SetUsername("tomsmith");
        loginpage.SetPassword("SuperSecretPassword!");
        Assert.assertTrue(loginpage.isDisplayedButton(), "Le bouton LOGIN n'est pas affiché.");
        Assert.assertTrue(loginpage.isisEnabledButton(), "le boutton login n'est pas cliquable ");

        SecureAreaPage secureareapage =loginpage.cliqueLoginButton();
        String message = secureareapage.getMessageText();
        Assert.assertTrue(message.contains("You logged into a secure area!") );
        LoginPage loginpage1 = secureareapage.clickLogoutButton();


    }
}
