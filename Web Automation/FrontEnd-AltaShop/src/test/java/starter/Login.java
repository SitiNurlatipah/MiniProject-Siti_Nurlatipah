package starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Login extends PageObject {

    private By barCategory(){return By.xpath("(//div/*[@role=\"button\"])[2]");}

    private By fieldEmail(){return By.xpath("//*[label[text()='Email']]/input");}
    private By fieldPassword(){return By.xpath("//*[label[text()='Password']]/input");}
    private By loginButton(){return  By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");}
    private By errorMassage(){return By.className("v-alert__wrapper");}


    @Step
    public void onLoginPage(){openAt("/auth/login");}
    @Step
    public void typeMyEmail(String email){$(fieldEmail()).sendKeys(email);}
    @Step
    public void typeMyPassword(String password){$(fieldPassword()).sendKeys(password);}
    @Step
    public void clickLoginButton(){$(loginButton()).click();}
    @Step
    public void validateOnHomePage(){$(barCategory()).isDisplayed();
    }
    @Step
    public void gotErrorMassage(){$(errorMassage()).isDisplayed();}
}
