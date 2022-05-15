package starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Homepage extends PageObject {
    private By details(){return By.xpath("(//div/*[@class=\"mt-3\"]//button[1])[3]");}
    private By rating(){return By.xpath("//div/*[@class=\"v-rating v-rating--dense\"]/button[5]");}
    private By getRating(){return By.xpath("//div/*[@class=\"v-rating v-rating--dense\"]");}
    @Step
    public void onHomePage(){open();}
    @Step
    public void getDetails(){$(details()).click();}
    @Step
    public void giveRating(){$(rating()).click();}
    @Step
    public void ratingCount(){$(getRating()).getElement();}
}
