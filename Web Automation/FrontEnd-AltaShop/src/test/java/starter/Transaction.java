package starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Transaction extends PageObject {
    private By transactionText(){return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div[1]/table/thead/tr/th[1]");}
    public void validateOnTransactionPage(){$(transactionText()).isDisplayed();
    }
    @Step
    public void onTransactionPage(){openAt("/transaction");}
}
