package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimplifiedViewButtonActions extends Page{
    private FillingField fillingField;

    @FindBy(xpath = "//button[contains(@class, 'btn btn-primary')]")
    private WebElement fillingViewButton;

    public SimplifiedViewButtonActions(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public FillingField openFillingField() {
        fillingViewButton.click();
        return fillingField;
    }
}