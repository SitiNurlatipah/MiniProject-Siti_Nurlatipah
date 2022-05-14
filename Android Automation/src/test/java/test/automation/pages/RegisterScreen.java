package test.automation.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {
    public String name="";
    public String email="";
    public String password="";
    private By productText() {return MobileBy.AccessibilityId("Products");}
    private By loginIcon() {return MobileBy.xpath("//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");}
    private By linkRegis(){return MobileBy.AccessibilityId("Register");}
    private By fullnameField(){return MobileBy.xpath("//android.widget.LinearLayout//android.widget.EditText[1]");}
    private By emailField(){return MobileBy.xpath("//android.widget.LinearLayout//android.widget.EditText[2]");}
    private By passwordField(){return MobileBy.xpath("//android.widget.LinearLayout//android.widget.EditText[3]");}
    private By registerButton(){return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");}
    private By snackbarError(){return MobileBy.AccessibilityId("Gagal :(");}
    @Step
    public boolean onLandingPage(){
        return waitUntilPresence(productText()).isDisplayed();
    }
    @Step
    public void tapLogin(){onClick(loginIcon());}
    @Step
    public void tapRegisterLink(){onClick(linkRegis());}
    @Step
    public void tapFullname(){onClick(fullnameField());}
    @Step
    public void clearFullname(){clear(fullnameField());}
    @Step
    public void inputFullname() {
        Faker faker = new Faker();
        name=faker.name().fullName();
        onType(fullnameField(),name);
    }
    @Step
    public void tapEmail(){onClick(emailField());}
    @Step
    public void clearEmail(){clear(emailField());}
    @Step
    public void inputEmail(){
        Faker faker = new Faker();
        email=faker.internet().emailAddress();
        onType(emailField(),email);
    }
    @Step
    public void tapPassword(){onClick(passwordField());}
    @Step
    public void clearPassword(){clear(passwordField());}
    @Step
    public void inputPassword(){
        Faker faker = new Faker();
        password=faker.internet().password();
        onType(passwordField(),password);
    }
    @Step
    public void tapRegisterButton(){onClick(registerButton());}
    @Step
    public void errorMassage(){waitUntilVisible(snackbarError()).getText();}
}
