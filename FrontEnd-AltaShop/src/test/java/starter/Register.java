package starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Register extends PageObject {

    private By Fullname(){
        return By.id("input-345");}
    private By Email(){return By.id("input-348");}
    private By Password(){return By.id("input-351");}
    private By RegisterButton(){return By.className("button.v-btn.v-btn--is-elevated.v-btn--has-bg.theme--light.v-size--default.primary");}

    @Step
    public void onRegisterPage(){openAt("/auth/register");}
    @Step
    public void typeFullname(String fullname){$(Fullname()).type(fullname);}
    @Step
    public void typeEmail(String email){$(Email()).type(email);}
    @Step
    public void typePassword(String password){$(Password()).type(password);}
    @Step
    public void clickRegisterButton(){$(RegisterButton()).click();}

    }
