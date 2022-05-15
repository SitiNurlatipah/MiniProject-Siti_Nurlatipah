package starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class BuyProducts extends PageObject {

    private By beliTensiDarah(){return By.xpath("//*[@id=\"519\"]/div/div[3]/div[2]/button[2]");}
    private By beliCamera(){return By.xpath("//*[@id=\"524\"]/div/div[3]/div[2]/button[2]");}
    private By beliCincinEmas(){return By.xpath("//*[@id=\"867\"]/div/div[3]/div[2]/button[2]");}
    private By chartButton(){return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]");}
    private By chartAdded(){return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]/span/span/span/span");}

    @Step
    public void buyTensiDarah(String tensi){$(beliTensiDarah()).click();}
    @Step
    public void buyCamera(String camera){$(beliCamera()).click();}
    @Step
    public void buyCincinEmas(String cincin){$(beliCincinEmas()).click();}
    @Step
    public void shopChartButton(){$(chartButton()).click();}
    @Step
    public void chartIncreased(){$(chartAdded()).isDisplayed();}
}
