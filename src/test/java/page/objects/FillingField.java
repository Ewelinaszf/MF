package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class FillingField extends HomePage {

    private FillingFieldMainSection fillingFieldMainSection;
    private FillingFieldButtonActions fillingFieldButtonActions;

    public FillingField(WebDriver driver) {
        super(driver);
        this.fillingFieldMainSection = new FillingFieldMainSection(driver);
        this.fillingFieldButtonActions = new FillingFieldButtonActions(driver);
        PageFactory.initElements(driver, this);
    }


    public FillingFieldMainSection getFillingFieldMainSection() {
        return this.fillingFieldMainSection;
    }

    public FillingFieldButtonActions getFillingFieldButtonActions() {
        return this.fillingFieldButtonActions;
    }


}
