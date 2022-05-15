package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.HomepageScreen;

public class BuyProductStep {
    @Steps
    HomepageScreen homepage;
    @Given("I am on homepage")
    public void iOnHomepage() {
        boolean actual = homepage.onHomepage();
        Assert.assertTrue(actual);
    }

    @When("I tap beli button on Durian")
    public void iTapBeliButton() {
        homepage.tapBeliDuren();
    }
    @And("The number on the chart increased {}")
    public void iTypeEmail(String jumlah) {
        boolean actual = homepage.numberChartIncreased();
        Assert.assertTrue(actual);}
}
