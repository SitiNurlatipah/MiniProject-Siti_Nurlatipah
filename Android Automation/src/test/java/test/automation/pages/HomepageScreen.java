package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class HomepageScreen extends BasePageObject {
    private By productField() {return MobileBy.xpath("(//android.view.View[@content-desc=\"kesehatan\"])[2]");}
    private By buyDuren(){return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[3]");}
    private By chart(){return MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");}

    @Step
    public boolean onHomepage() {
        return waitUntilPresence(productField()).isDisplayed();
    }
    @Step
    public void tapBeliDuren(){onClick(buyDuren());}
    @Step
    public boolean numberChartIncreased(){
        return waitUntilVisible(chart()).isDisplayed();
    }

}
