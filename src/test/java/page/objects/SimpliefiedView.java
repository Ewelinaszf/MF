package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SimpliefiedView extends Page {

    private SimpliefiedViewMainSection simpliefiedViewMainSection;
    private SimplifiedViewButtonActions simplifiedViewButtonActions;

    public SimpliefiedView(WebDriver driver) {
        super(driver);
        this.simpliefiedViewMainSection = new SimpliefiedViewMainSection(driver);
        this.simplifiedViewButtonActions = new SimplifiedViewButtonActions(driver);
        PageFactory.initElements(driver, this);
    }

    public SimpliefiedViewMainSection getSimpliefiedViewMainSection() {
        return this.simpliefiedViewMainSection;
    }
    public SimplifiedViewButtonActions getSimplifiedViewButtonActions(){
        return this.simplifiedViewButtonActions;
    }

}
