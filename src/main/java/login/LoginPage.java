package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import securearea.SecureAreaPage;

public class LoginPage {

    // Instance du WebDriver
    private WebDriver driver;

    // ⚠️ Champ inutile et incorrect (à supprimer)
    public Boolean Boolean;

    // Locators des champs de login
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.className("radius");

    // Constructeur
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // Saisie du username
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    // Saisie du password
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    // Vérifie si le bouton login est affiché
    public boolean isLoginButtonDisplayed(){
        return driver.findElement(loginButton).isDisplayed();
    }

    // Vérifie si le bouton login est activé
    public boolean isLoginButtonEnabled(){
        return driver.findElement(loginButton).isEnabled();
    }

    // Clique sur login et retourne la page sécurisée
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}