package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage2 {

    @FindBy(xpath = "//*[@id=\'app\']/div[4]/div[2]/div[2]/div/div[1]/div/div/div[3]/div/button")
    private WebElement addField;

    @FindBy(xpath = "//*[@id='app']/div[4]/div[2]/div[2]/div/div[1]/div/div[2]/div/div[4]/div/button")
    private WebElement add;

    @FindBy(xpath = "//span[text()='Pole wprowadzania']")
    private WebElement inputField;

    @FindBy(xpath = "//div[contains(@class, 'form-section PoleWprowadzania1')]")
    private WebElement poleWprowadzania;

    @FindBy(xpath = "//span[contains(@class, 'field-programming__btn')]//*[@class='fas fa-pen']")
    private WebElement setProgrammingRule;

    @FindBy(xpath = "//pre[contains(@class, 'prism-editor__code language-js')]")
    private WebElement ruleWindow;

    @FindBy(xpath = "//button[contains(@class, 'button__outline false false false false button')]")
    private WebElement saveProgrammingRule;

    @FindBy(id = "input90")
    private WebElement contentType;

    private WebDriver driver;
    private WebElement section;

    public BasePage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addInputField() {
        addField.click();
        inputField.click();
        add.click();
    }

    public void changeTypeOfInputField(int i) {
        clickOnField(i);
        contentType = section.findElement(By.xpath("//../div[5]/div[2]/select"));
        Select selectType = new Select(contentType);
        selectType.selectByVisibleText("Liczba");
    }

    public void clickOnField(int i) {
        section = driver.findElement(By.xpath("//div[contains(@class, 'form-section PoleWprowadzania"+i+"')]"));
        Actions action = new Actions(driver);
        action.moveToElement(section).click().build().perform();
        action.moveToElement(section).click().build().perform();

    }

    public void setProgrammingRule(int i) {
        clickOnField(i);
        setProgrammingRule.click();
        ruleWindow.click();
        ruleWindow.sendKeys("references(['PoleWprowadzania1', 'PoleWprowadzania2']),\n" +
                "calculated(({num}) => num['PoleWprowadzania1'] + num['PoleWprowadzania2'])\n");
        saveProgrammingRule.click();
    }


}
