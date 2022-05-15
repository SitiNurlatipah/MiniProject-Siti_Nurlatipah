package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Login;
import starter.Transaction;

public class TransactionStep {
    @Steps
    Login login;
    @Steps
    Transaction transaction;
    @Given("{} am at transaction page")
    public void iAmAtOrderPage(String name) {
        transaction.onTransactionPage();
    }

    @When("I click login-button")
    public void iClickBayarButton() {
        transaction.toLoginPage();
    }
    @And("I type the email {}")
    public void inputEmail(String email){
        login.typeMyEmail(email);
        }
    @And("I type the password {}")
    public void inputPassword(String password){
        login.typeMyPassword(password);
        login.clickLoginButton();
    }
    @And("I go to transaction page")
    public void goToTransactionPage(){
        transaction.onTransactionPage();
    }
    @And("I click price field")
    public void clickPriceField(){
        transaction.shortPrice();
    }
    @Then("The table start from lowlest price")
    public void iOnTransactionPage(){
        transaction.tableListShort();
    }

}
