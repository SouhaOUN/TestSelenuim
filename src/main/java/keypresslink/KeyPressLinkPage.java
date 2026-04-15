package keypresslink;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressLinkPage {
    private WebDriver driver;
     public KeyPressLinkPage(WebDriver driver){
         this.driver = driver;
     }
     private By inputFailed =By.id("target");
     private By resultText = By.id("result");

     public void EnterText(Keys key){
         driver.findElement(inputFailed).sendKeys(key);
     }
     public String GetResult(){
         return driver.findElement(resultText).getText();
    }
}
