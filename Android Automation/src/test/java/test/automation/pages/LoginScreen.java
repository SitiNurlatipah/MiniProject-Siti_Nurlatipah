package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {

    private By productText() {return MobileBy.AccessibilityId("Products");}
    private By loginIcon() {return MobileBy.xpath("//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");}
    private By emailField(){return MobileBy.xpath("//android.view.View//android.widget.EditText[1]");}
    private By passwordField(){return MobileBy.xpath("//android.view.View//android.widget.EditText[2]");}
    private By loginButton(){return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]\n");}
    private By snackbarLogin(){return MobileBy.AccessibilityId("Email atau password tidak valid.");}
    @Step
    public boolean onHomepage() {
        return waitUntilPresence(productText()).isDisplayed();
    }

    @Step
    public void tapLoginIcon(){onClick(loginIcon());
    }
    @Step
    public void tapEmail(){onClick(emailField());}
    @Step
    public void typeEmail(String email){onType(emailField(),email);}
    @Step
    public void tapPassword(){onClick(passwordField());}

    @Step
    public void typePassword(String password){onType(passwordField(),password);}
    @Step
    public void tapLoginButton(){onClick(loginButton());}
    @Step
    public void massageError(){waitUntilVisible(snackbarLogin()).getText();}

}
