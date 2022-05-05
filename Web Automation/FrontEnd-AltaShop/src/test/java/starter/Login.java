package starter;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By title(){return By.className("v-card__title");}
    public void validateOnLoginPage(){$(title()).isDisplayed();
    }
}
