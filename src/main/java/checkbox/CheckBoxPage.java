package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxPage {
    WebDriver driver;
    private By checkboxes = By.cssSelector("#checkboxes input");
    public CheckBoxPage (WebDriver driver){
        this.driver = driver;
    }

    // Récupérer toutes les checkboxes
    public List<WebElement> getCheckboxes(){
        return driver.findElements(checkboxes);
    }

    // Récupérer une checkbox spécifique
    public WebElement getCheckbox(int index){
        return getCheckboxes().get(index);
    }
    public void clickCheckBox(int index){
        getCheckbox(index).click();
    }
    // Vérifier état
    public boolean isChecked(int index) {
        return getCheckbox(index).isSelected();
    }


}
