package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Order;
import starter.Transaction;

public class OrderStep {
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
        order.bayar();
    }
    @Then("I on transaction page")
    public void iOnTransactionPage(){
        transaction.validateOnTransactionPage();
    }
}
