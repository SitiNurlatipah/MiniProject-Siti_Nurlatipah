package starter;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By beliText(){return By.xpath("//*[@id=\"209\"]/div/div[3]/div[2]/button[2]");}
    public void validateOnHomePage(){$(beliText()).isDisplayed();
    }
}
