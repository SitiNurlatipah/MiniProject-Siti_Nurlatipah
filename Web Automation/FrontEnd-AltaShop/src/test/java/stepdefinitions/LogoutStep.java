package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.HomePage;
import starter.Login;
import starter.Logout;
import starter.Transaction;

public class LogoutStep {
    @Steps
    Transaction transaction;
    @Steps
    Login login;
    @Steps
    Logout logout;
    @Given("{} am at transaction page")
    public void iAmAtTransactionPage(String name) {
        transaction.onTransactionPage();
    }

    @When("I click people icon")
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
