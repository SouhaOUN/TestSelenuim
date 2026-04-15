package keypresslink;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressLinkPage {

    // Instance du WebDriver
    private WebDriver driver;

    // Constructeur
    public KeyPressLinkPage(WebDriver driver){
        this.driver = driver;
    }

    // Champ de saisie où les touches sont envoyées
    private By inputField = By.id("target");

    // Zone qui affiche le résultat du key press
    private By resultText = By.id("result");

    /**
     * Envoie une touche clavier dans le champ input
     * @param key touche clavier Selenium (Keys)
     */
    public void enterText(Keys key){
        driver.findElement(inputField).sendKeys(key);
    }

    /**
     * Récupère le message affiché après l'action clavier
     * @return texte du résultat
     */
    public String getResult(){
        return driver.findElement(resultText).getText();
    }
}