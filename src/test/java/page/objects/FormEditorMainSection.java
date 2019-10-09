package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormEditorMainSection extends Page {
    private NameOfFields nameOfFields;
    final String[] fieldType = {"Pole wprowadzania", "Pole wyboru"};
    private WebElement field;
    private Fields fields;
    private FormEditor formEditor;



    @FindBy(xpath = "//div[contains(@class, 'form-creator__wrapper')]/div/div/div/div[3]/i")
    private WebElement addField;

    @FindBy(xpath = "//div[contains(@class, 'editor-modal__footer')]/div/button")
    private WebElement add;

    @FindBy(xpath = "//span[text()='Pole wprowadzania']")
    private WebElement inputField;

    @FindBy(xpath = "//span[text()='Pole wyboru']")
    private WebElement choiceField;

    public FormEditorMainSection(WebDriver driver) {
        super(driver);
        this.formEditor = new FormEditor(driver);
        PageFactory.initElements(driver, this);
    }

    public FormEditor addField(Fields fields) {
        addField.click();
        inputField.click();
        add.click();
        return formEditor;
    }

    public void addChoiceField(Fields fields) {
        addField.click();
        choiceField.click();
        add.click();
    }

    public void clickOnEnteringField(int i) {
        field = driver.findElement(By.xpath("//div[contains(@class, 'form-section PoleWprowadzania" + i + "')]"));
        Actions action = new Actions(driver);
        action.moveToElement(field).click().build().perform();
        action.moveToElement(field).click().build().perform();
    }

    public void clickOnChoiceField(int i) {
        field = driver.findElement(By.xpath("//div[contains(@class, 'form-section hover-border hover-borders-vertical PoleWyboru" + i + "')]"));
        Actions action = new Actions(driver);
        action.moveToElement(field).click().build().perform();
        action.moveToElement(field).click().build().perform();
    }

}
