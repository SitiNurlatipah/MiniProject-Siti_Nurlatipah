package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.RegisterScreen;

public class RegisStep {

    @Steps
    RegisterScreen regis;
    @Given("I on landing page")
    public void iOnLandingPage() {
        boolean actual = regis.onLandingPage();
        Assert.assertTrue(actual);
    }

    @When("I tap login-icon")
    public void iTapLogin() {
        regis.tapLogin();
    }
    @And("I tap register link")
    public void tapRegisLink() {
        regis.tapRegisterLink();
    }
    @And("I input full name")
    public void iInputFullName() {
        regis.tapFullname();
        regis.clearFullname();
        regis.inputFullname();
    }

    @And("I input email")
    public void iInputEmail() {
        regis.tapEmail();
        regis.clearEmail();
        regis.inputEmail();
    }

    @And("I input password")
    public void iInputPassword() {
        regis.tapPassword();
        regis.clearPassword();
        regis.inputPassword();
    }
    @And("I tap register button")
    public void iTapRegisterButton() {
        regis.tapRegisterButton();
    }
    @Then("I on home-page")
    public void gotErrorMassage() {
        boolean actual = regis.onLandingPage();
        Assert.assertTrue(actual);
    }

}
