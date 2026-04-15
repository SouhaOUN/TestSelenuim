package upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {

    // Instance du WebDriver
    WebDriver driver;

    // Champ input pour choisir un fichier
    private By chooseFile = By.id("file-upload");

    // Bouton submit
    private By submitButton = By.id("file-submit");

    // Message affiché après upload
    private By message = By.cssSelector("#content h3");

    // Constructeur
    public UploadFilePage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Upload un fichier via le chemin local
     * @param path chemin complet du fichier
     */
    public void uploadFile(String path){
        driver.findElement(chooseFile).sendKeys(path);
    }

    // Clique sur le bouton submit
    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    // Récupère le message après upload
    public String getMessage(){
        return driver.findElement(message).getText();
    }
}