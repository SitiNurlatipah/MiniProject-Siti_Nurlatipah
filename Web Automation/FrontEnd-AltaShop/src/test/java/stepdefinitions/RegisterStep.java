package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Register;

public class RegisterStep {
    @Steps
    Register register;

    @Given("{} am at register page")
    public void iAmAtRegisterPage(String name) {
        register.onRegisterPage();
    }
    @When("I type fullname {}")
    public void iTypeFullname(String arg0) {
        register.typeFullname(arg0);
    }
    @And("I type email")
    public void iTypeEmail() {
        Faker faker=new Faker();
        register.typeEmail(faker.internet().emailAddress());
    }
    @And("I type password {}")
    public void iTypePassword(String arg0){
        register.typePassword(arg0);
    }
    @And("I click Register button")
    public void iClickLoginButton() {
        register.clickRegisterButton();
    }
    @Then("I on Login Page")
    public void iOnLoginPage(){
    register.validateOnLoginPage();
    }

    @Given("{} am on register page")
    public void iAmOnRegisterPage(String name) {
        register.onRegisterPage();
    }
    @When("I type My fullname {}")
    public void iTypeMyFullname(String arg1) {
        register.typeFullname(arg1);
    }
    @And("I type My password {}")
    public void iTypeMyPassword(String arg1){
        register.typePassword(arg1);
    }
    @And("I click a Register button")
    public void iClickRegisterButton() {
        register.clickRegisterButton();
    }
    @Then("I got error massage")
    public void iGotErrorMassage(){
        register.iGotErrorMassage();
    }

}
