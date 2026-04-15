package largedeepdom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeepDomPage {

    // Instance du WebDriver pour interagir avec le navigateur
    WebDriver driver;

    // Localisateur de la grande table dans la page
    private By LargeTable = By.id("large-table");

    // Constructeur
    public LargeDeepDomPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Fait défiler la page jusqu'à la table
     */
    public void scrollIntoTable(){

        // Localiser la table dans le DOM
        WebElement table = driver.findElement(LargeTable);

        // Script JavaScript pour scroller jusqu'à l'élément
        String script = "arguments[0].scrollIntoView();";

        // Exécuter le script JavaScript avec l'élément comme argument
        ((JavascriptExecutor) driver).executeScript(script, table);
    }
}