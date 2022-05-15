package starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Order extends PageObject {
    private By clickBayar(){return By.id("button-bayar");}
    private By buyProduct(){return By.xpath("//*[@id=\"523\"]//button[2]");}
    @Step
    public void onOrderPage(){openAt("/order");}
    @Step
    public void bayar(){$(clickBayar()).click();}
    @Step
    public void buyMousePad(){$(buyProduct()).click();}
}
