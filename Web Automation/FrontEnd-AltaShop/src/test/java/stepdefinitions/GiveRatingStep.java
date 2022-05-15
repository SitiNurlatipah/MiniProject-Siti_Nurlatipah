package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Homepage;

public class GiveRatingStep {
    Homepage homepage;
    @Given("I at homepage")
    public void iAtHomepage() {
        homepage.onHomePage();
    }
    @When("I click detail product")
    public void iClickDetail() {
        homepage.getDetails();
    }
    @And("I give rating for product")
    public void iGiveRating(){
        homepage.giveRating();
    }
    @Then("Rating count added")
    public void ratingCountAdded(){
        homepage.ratingCount();
    }

}
