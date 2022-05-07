package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.HomePage;

public class HomePageStep {
    @Steps
    HomePage homePage;
    @Given("{} am at home page")
    public void iAmAtHomePage(String name) {
        homePage.validateOnHomePage();
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
