package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.BuyProducts;
import starter.Order;
import starter.Transaction;
import starter.Login;
public class OrderStep {
    @Steps
    Login login;
    @Steps
    Order order;
    @Steps
    Transaction transaction;
    @Steps
    BuyProducts chart;
    @Given("{} am at order page")
    public void iAmAtOrderPage(String name) {
        order.onOrderPage();
    }

    @When("I click login icon")
    public void iClickBayarButton() {
        transaction.toLoginPage();}
    @And("I input email {}")
    public void inputEmail(String email){
        login.typeMyEmail(email);}
    @And("I input password {}")
    public void inputPassword(String password){
        login.typeMyPassword(password);
        login.clickLoginButton();
    }
    @And("I buy {}")
    public void iBuyMousepad(String product){
        order.buyMousePad();
        chart.shopChartButton();
    }
    @And("I click bayar")
    public void iClickBayar(){
        order.bayar();
    }

    @Then("I on transaction page")
    public void iOnTransactionPage(){
        transaction.validateOnTransactionPage();
    }
}
