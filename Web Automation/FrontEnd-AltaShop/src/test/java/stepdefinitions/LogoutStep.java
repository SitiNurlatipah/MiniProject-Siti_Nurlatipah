package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Login;
import starter.Logout;

public class LogoutStep {

    @Steps
    Login login;
    @Steps
    Logout logout;
    @Given("{} on login-page")
    public void onLoginPage(String nama){login.onLoginPage();}
    @When("I input my email {}")
    public void inputMyEmail(String email){login.typeMyEmail(email);}
    @And("I input my password {}")
    public void inputMyPassword(String password){login.typeMyPassword(password);
    login.clickLoginButton();}
    @And("I on landing page")
    public void iOnLandingPage() {
        login.validateOnHomePage();
    }
    @And("I click people-icon")
    public void iClickPepopleIcon() {
        logout.clickPeopleButton();
    }
    @And("I click logout button")
    public void iClickLogoutButton() {
        logout.klikLogoutButton();
    }
    @Then("I on LoginPage")
    public void onLoginPage(){
        login.onLoginPage();
    }


}
