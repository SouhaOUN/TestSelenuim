package dynamicloading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Exemple1DynamicLoading {

    // Instance du WebDriver pour interagir avec le navigateur
    WebDriver driver;

    // Localisateur du bouton "Start"
    private By startButton = By.cssSelector("#start button");

    // Localisateur du loader (animation de chargement)
    private By loader = By.id("loading");

    // Localisateur du message affiché après chargement
    private By message = By.cssSelector("#finish h4");

    // Constructeur
    public Exemple1DynamicLoading(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Clique sur le bouton Start et attend le chargement dynamique
     */
    public void clickStartButton(){

        // Cliquer sur le bouton Start
        driver.findElement(startButton).click();

        // Définir une attente explicite (max 30 secondes)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Attendre la disparition du loader (meilleure stabilité)
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));

        // Attendre que le message soit visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(message));
    }

    /**
     * Récupère le message affiché après chargement
     * @return texte du message
     */
    public String getMessage(){
        return driver.findElement(message).getText();
    }
}