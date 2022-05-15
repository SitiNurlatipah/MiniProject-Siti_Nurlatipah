package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Login;
import starter.BuyProducts;

public class BuyProductsStep {
    @Steps
    Login login;
    @Steps
    BuyProducts homePage;
    @Given("{} at login page")
    public void iAtLoginPage(String name) {
        login.onLoginPage();
    }
    @When("I enter email {}")
    public void iEnterEmail(String email) {
        login.typeMyEmail(email);
    }
    @And("I enter password {}")
    public void iEnterPassword(String password) {
        login.typeMyPassword(password);
        login.clickLoginButton();
    }
    @And("First I buy {}")
    public void iBuyTensiElektrik(String tensi0){
        homePage.buyTensiDarah(tensi0);
    }
    @And("Second I buy {}")
    public void iBuyCamera(String camera){
        homePage.buyCamera(camera);
    }
    @And("Third I buy {}")
    public void iBuyCincinEmas(String cincin){
        homePage.buyCincinEmas(cincin);
    }
    @And("I click chart button")
    public void iclickChartButton(){
        homePage.shopChartButton();
    }
    @Then("I on order page and The product I bought it is here")
    public void onOrderPageAndTheProductIsHere(){
        homePage.chartIncreased();
    }

    @Given("{} am at home page")
    public void iAmAtHomePage(String name) {
        login.validateOnHomePage();
    }
    @When("First I click beli button on {}")
    public void iBeliTensiDarah(String tensi) {
        homePage.buyTensiDarah(tensi);
    }
    @And("Second I click beli button on {}")
    public void iBeliCamera(String camera) {
        homePage.buyCamera(camera);
    }
    @And("Third I click beli button on {}")
    public void iBeliCincinEmas(String cincin){
        homePage.buyCincinEmas(cincin);
    }
    @Then("The number of chart increased")
    public void numberOfChartincreased(){
        homePage.chartIncreased();
    }

}
