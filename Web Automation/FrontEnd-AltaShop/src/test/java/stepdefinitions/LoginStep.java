package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.HomePage;
import starter.Login;

public class LoginStep {
    @Steps
    Login login;
    @Steps
    HomePage homePage;
    @Given("{} am at login page")
    public void iAmAtRegisterPage(String name) {
        login.onLoginPage();
    }

    @When("I type my email {}")
    public void iTypeMyEmail(String email) {
        login.typeMyEmail(email);
    }

    @And("I type my password {}")
    public void iTypeMyPassword(String password) {
        login.typeMyPassword(password);

    }
    @And("I click Login button")
    public void iClickLoginButton(){
        login.clickLoginButton();
    }

    @Then("I on home page")
    public void iOnLoginPage(){
        homePage.validateOnHomePage();
    }

}
