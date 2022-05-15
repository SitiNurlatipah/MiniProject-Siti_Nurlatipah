package starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class BuyProducts extends PageObject {

    private By produkKesatu(){return By.xpath("(//div/*[@class=\"mt-3\"]//button[2])[1]");}
    private By produkKedua(){return By.xpath("(//div/*[@class=\"mt-3\"]//button[2])[2]");}
    private By produkKetiga(){return By.xpath("(//div/*[@class=\"mt-3\"]//button[2])[3]");}
    private By chartButton(){return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]");}
    private By chartAdded(){return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]/span/span/span/span");}

    @Step
    public void buyTensiDarah(String tensi){$(produkKesatu()).click();}
    @Step
    public void buyCamera(String camera){$(produkKedua()).click();}
    @Step
    public void buyCincinEmas(String cincin){$(produkKetiga()).click();}
    @Step
    public void shopChartButton(){$(chartButton()).click();}
    @Step
    public void chartIncreased(){$(chartAdded()).isDisplayed();}
}
