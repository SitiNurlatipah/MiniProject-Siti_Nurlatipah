package starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;

public class Logout extends PageObject {
    private By clickPeopleIcon(){return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span/i");}
    private By clickLogoutButton(){return By.id("list-item-9029");}
    @Step
    public void clickPeopleButton(){$(clickPeopleIcon()).click();}
    @Step
    public void klikLogoutButton(){$(clickLogoutButton()).click();}


}
