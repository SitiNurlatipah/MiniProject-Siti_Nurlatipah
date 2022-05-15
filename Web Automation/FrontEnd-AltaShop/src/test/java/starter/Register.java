package starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Register extends PageObject {
    private By title(){return By.xpath("//*[@class=\"v-card__title\"]");}
    private By Fullname(){
        return By.xpath("//*[label[text()='Nama Lengkap']]/input");}
    private By Email(){return By.xpath("//*[label[text()='Email']]/input");}
    private By Password(){return By.xpath("//*[label[text()='Password']]/input");}
    private By RegisterButton(){return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button");}
    private By gotErrorMassage(){return By.className("v-alert__wrapper");}
    @Step
    public void onRegisterPage(){openAt("/auth/register");}
    @Step
    public void typeFullname(String fullname){$(Fullname()).sendKeys(fullname);}
    @Step
    public void typeEmail(String email){$(Email()).sendKeys(email);}
    @Step
    public void typePassword(String password){$(Password()).sendKeys(password);}
    @Step
    public void clickRegisterButton(){$(RegisterButton()).click();}
    @Step
    public void iGotErrorMassage(){$(gotErrorMassage()).isDisplayed();}
    @Step
    public void validateOnLoginPage(){$(title()).isDisplayed();
    }
    }

