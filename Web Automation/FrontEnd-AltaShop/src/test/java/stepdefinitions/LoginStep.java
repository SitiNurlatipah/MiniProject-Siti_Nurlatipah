package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Login;

public class LoginStep {
    @Steps
    Login login;

    @Given("{} am at login-page")
    public void iAmAtLoginPage(String name) {
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
    public void iOnHomePage(){
        login.validateOnHomePage();
    }

    @Given("{} am on loginpage")
    public void iAmOnLoginPage(String name) {
        login.onLoginPage();
    }
    @When("I type valid email {}")
    public void iTypeValidEmail(String email1) {
        login.typeMyEmail(email1);
    }
    @And("I type unvalid password {}")
    public void iTypeUnvalidPassword(String password1) {
        login.typeMyPassword(password1);
    }
    @And("I click a Login button")
    public void iClickALoginButton(){
        login.clickLoginButton();
    }
    @Then("I got error massage {}")
    public void iGotErrorMassage(String error){
        login.gotErrorMassage();
    }

    @Given("{} on login page")
    public void iOnLoginPage(String name) {
        login.onLoginPage();
    }
    @When("I type unvalid email {}")
    public void iTypeUnvalidEmail(String email2) {
        login.typeMyEmail(email2);
    }
    @And("I type valid password {}")
    public void iTypeValidPassword(String password2) {
        login.typeMyPassword(password2);
    }
    @And("I click login button")
    public void iClickLoginBttn(){
        login.clickLoginButton();
    }
    @Then("I got Error Massage {}")
    public void iGotErrorMssage(String error1){
        login.gotErrorMassage();
    }
}
