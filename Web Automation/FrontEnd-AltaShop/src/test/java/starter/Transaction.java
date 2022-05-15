package starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Transaction extends PageObject {
    private By transactionText(){return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div[1]/table/thead/tr/th[1]");}
    private By login(){return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span/i");}
    private By fieldShort(){return By.className("v-data-table-header");}
    private By lowLest(){return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div[1]/table/tbody");}
    @Step
    public void validateOnTransactionPage(){$(transactionText()).isDisplayed();
    }
    @Step
    public void toLoginPage(){$(login()).click();}
    @Step
    public void onTransactionPage(){openAt("/transaction");}
    @Step
    public void shortPrice(){$(fieldShort()).click();}
    @Step
    public void tableListShort(){$(lowLest()).getElement();}
}
