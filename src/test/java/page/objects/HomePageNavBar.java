package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageNavBar extends Page {

    @FindBy(xpath="//button[contains(@class, 'btn btn-secondary')]")
    private WebElement logOut;

    private Page page;
    public HomePageNavBar(WebDriver driver) {
        super(driver);
    }

    public Page logOut() {
        this.logOut.click();
        return this.page;

    }
}
