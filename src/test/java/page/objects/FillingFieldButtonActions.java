package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillingFieldButtonActions extends FormEditor{

    @FindBy(xpath="//button[contains(text(), 'podgląd uproszczony')]")
    private WebElement simplifiedPreview;

  private SimpliefiedView simpliefiedView;
    public FillingFieldButtonActions(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.simpliefiedView = new SimpliefiedView(driver);

    }

    public SimpliefiedView openSimplifiedPreview() throws InterruptedException {
        simplifiedPreview.click();
        Thread.sleep(5000);
        return simpliefiedView;

    }

}
