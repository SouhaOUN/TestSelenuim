package alert;

import base.BaseTests;
import home.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTests {
    @Test
    public void testAlertTests() {
        HomePage homePage = new HomePage(driver);
        AlertPage alertPage = homePage.clickAlertLinkPage();
        /*
        alertPage.clickTriggerAlertButton1();
        alertPage.acceptAlert();
        String result = alertPage.getMessage();
        Assert.assertEquals(result, "You successfully clicked an alert", "Incorrect");
        */
        /*
        alertPage.clickTriggerAlertButton2();
        alertPage.dismissAlert();
        String result = alertPage.getMessage();
        Assert.assertEquals(result, "You clicked: Cancel", "Incorrect Alert Trigger");
         */
        alertPage.clickTriggerAlertButton3();
        String input =  "Hello";
        alertPage.setAlertInput(input);
        System.out.println(input);
        alertPage.acceptAlert();
        String result = alertPage.getMessage();
        System.out.println(result);
        Assert.assertEquals(result, "You entered: " +input , "Incorrect Alert Trigger");

    }
}

