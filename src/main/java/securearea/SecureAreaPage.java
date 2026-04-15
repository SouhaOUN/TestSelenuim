package securearea;

import login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    // Instance du WebDriver
    private WebDriver driver;

    // Message affiché après login (success / error)
    private By message = By.id("flash");

    // Bouton logout
    private By logoutButton = By.cssSelector("[href=\"/logout\"]");

    // Constructeur
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    // Récupère le message affiché sur la page sécurisée
    public String getMessageText(){
        return driver.findElement(message).getText();
    }

    // Clique sur logout et retourne à la page login
    public LoginPage clickLogoutButton(){
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }
}