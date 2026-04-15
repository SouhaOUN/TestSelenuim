package infinitscroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfinitScrollPage {

    // Instance du WebDriver
    WebDriver driver;

    // Localisateur des paragraphes chargés dynamiquement
    private By paragraph = By.className("jscroll-added");

    // Constructeur
    public InfinitScrollPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Scroll jusqu'à atteindre un nombre donné de paragraphes
     * @param index nombre de paragraphes attendu
     */
    public void scrollToParagraph(int index){

        // Script JavaScript pour scroller vers le bas de la page
        String script = "window.scrollTo(0, document.body.scrollHeight);";

        // Boucle tant que le nombre de paragraphes est inférieur à l'objectif
        for(; getParagraph() < index; ) {

            // Exécuter le scroll
            ((JavascriptExecutor) driver).executeScript(script);
        }
    }

    /**
     * Retourne le nombre de paragraphes actuellement chargés
     * @return nombre de paragraphes
     */
    public int getParagraph(){
        return driver.findElements(paragraph).size();
    }
}