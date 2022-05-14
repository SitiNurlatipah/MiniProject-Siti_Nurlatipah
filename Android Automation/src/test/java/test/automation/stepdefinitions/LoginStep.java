package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.LoginScreen;

public class LoginStep {
    @Steps
    LoginScreen login;
    @Given("I on homepage")
    public void iOnHomepage() {
        boolean actual = login.onHomepage();
        Assert.assertTrue(actual);
    }

    @When("I tap login icon")
    public void iTapLoginIcon() {
        login.tapLoginIcon();
    }
    @And("I type email {}")
    public void iTypeEmail(String email) {
        login.tapEmail();
        login.typeEmail(email);
    }

    @And("I type password {}")
    public void iTypePassword(String password) {
        login.tapPassword();
        login.typePassword(password);
    }

    @And("I tap login button")
    public void iTapLoginButton() {
        login.tapLoginButton();
    }

    @Then("I get Error Massage")
    public void validateOnHomePage() {
        login.massageError();
    }

}
