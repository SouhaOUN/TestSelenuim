package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import securearea.SecureAreaPage;

public class LoginPage {
    private WebDriver driver;
    public Boolean Boolean;
    private By usernameFiled = By.id("username");
    private By passwordFailed = By.id("password");
    private By buttonLogin =By.className("radius");

    public LoginPage(WebDriver driver){
        this.driver =driver;
    }
    public void SetUsername(String username){
        driver.findElement(usernameFiled).sendKeys(username);
    }
    public void SetPassword(String password){
        driver.findElement(passwordFailed).sendKeys(password);
    }
    public boolean isDisplayedButton(){
        return driver.findElement(buttonLogin).isDisplayed();

    }
    public boolean isisEnabledButton(){
        return driver.findElement(buttonLogin).isEnabled();
    }
    public SecureAreaPage cliqueLoginButton(){
        driver.findElement(buttonLogin).click();
        return new SecureAreaPage(driver);
    }

}
