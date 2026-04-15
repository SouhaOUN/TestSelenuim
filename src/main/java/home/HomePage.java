package home;

import alert.AlertPage;
import checkbox.CheckBoxPage;
import dropdown.DropdownPage;
import dynamicloading.DynamicLoadingPage;
import infinitscroll.InfinitScrollPage;
import keypresslink.KeyPressLinkPage;
import largedeepdom.LargeDeepDomPage;
import login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import upload.UploadFilePage;

public class HomePage {

    // Instance du WebDriver
    private WebDriver driver;

    // Localisateurs des différents liens de la page d'accueil
    private By formAuthenticationLink = By.cssSelector("[href=\"/login\"]");
    private By keyPressLink = By.cssSelector("[href=\"/key_presses\"]");
    private By dropDownLink = By.cssSelector("[href=\"/dropdown\"]");
    private By alertLink = By.cssSelector("[href=\"/javascript_alerts\"]");
    private By largeDeppDomLink = By.cssSelector("[href=\"/large\"]");
    private By infinitToScrollLink = By.cssSelector("[href=\"/infinite_scroll\"]");
    private By uploadFileLink = By.cssSelector("[href=\"/upload\"]");
    private By dynamicLoading = By.cssSelector("[href=\"/dynamic_loading\"]");
    private By checkBoxLink = By.cssSelector("[href=\"/checkboxes\"]");

    // Constructeur
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // Navigation vers la page Login
    public LoginPage clickFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    // Navigation vers la page Key Press
    public KeyPressLinkPage clickKeyPressLink(){
        driver.findElement(keyPressLink).click();
        return new KeyPressLinkPage(driver);
    }

    // Navigation vers la page Dropdown
    public DropdownPage clickDropDownLink(){
        driver.findElement(dropDownLink).click();
        return new DropdownPage(driver);
    }

    // Navigation vers la page Alert
    public AlertPage clickAlertLinkPage(){
        driver.findElement(alertLink).click();
        return new AlertPage(driver);
    }

    // Navigation vers la page Large Deep DOM
    public LargeDeepDomPage clickLargeDeepDomLink(){
        driver.findElement(largeDeppDomLink).click();
        return new LargeDeepDomPage(driver);
    }

    // Navigation vers la page Infinite Scroll
    public InfinitScrollPage clickInfinitScrollLink(){
        driver.findElement(infinitToScrollLink).click();
        return new InfinitScrollPage(driver);
    }

    // Navigation vers la page Upload File
    public UploadFilePage clickUploadFileLink(){
        driver.findElement(uploadFileLink).click();
        return new UploadFilePage(driver);
    }

    // Navigation vers la page Dynamic Loading
    public DynamicLoadingPage clickDynamicLoadingLink(){
        driver.findElement(dynamicLoading).click();
        return new DynamicLoadingPage(driver);
    }

    // Navigation vers la page Checkboxes
    public CheckBoxPage clickCheckBoxLink(){
        driver.findElement(checkBoxLink).click();
        return new CheckBoxPage(driver);
    }
}