package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Order;
import starter.Transaction;
import starter.BLogin;
public class OrderStep {
    @Steps
    BLogin login;
    @Steps
    Order order;
    @Steps
    Transaction transaction;
    @Given("{} am at order page")
    public void iAmAtOrderPage(String name) {
        order.onOrderPage();
    }

    @When("I click bayar button")
    public void iClickBayarButton() {
        order.bayar();}
    @And("I input email {}")
    public void inputEmail(String email){
        login.typeMyEmail(email);}
    @And("I input password {}")
    public void inputPassword(String password){
        login.typeMyPassword(password);
        login.clickLoginButton();
    }
    @Then("I on transaction page")
    public void iOnTransactionPage(){
        transaction.validateOnTransactionPage();
    }
}
