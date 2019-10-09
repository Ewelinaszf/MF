package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpliefiedViewMainSection extends Page{

    private SimpliefiedView simpliefiedView;

    @FindBy(xpath="//div[contains(@class, 'wcag-display-value')]")
    private WebElement windowWithEnteredValue;

    public SimpliefiedViewMainSection(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String[] readData() {
        String splited = windowWithEnteredValue.getText().replaceAll(" ","");
        String[] splitedArray = null;
        splitedArray = splited.split(",");

        return splitedArray;
    }

    public SimpliefiedView goToSimpiefiedView() {
        return simpliefiedView;
    }


}
