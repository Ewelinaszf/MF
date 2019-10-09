package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class FormEditorRightSectionBar extends Page {

    public String[] names = {"Polska", "Belgia", "Hiszpania", "Niemcy"};
    private Types type;
    public WebElement systemName;
    public String NIP = "should.beNip";

    @FindBy(xpath = "//LABEL[text()='Nazwa systemowa']/../../../div[3]/div[1]")
    private WebElement setProgrammingRule;

    @FindBy(xpath = "//pre[contains(@class, 'prism-editor__code language-js')]")
    private WebElement ruleWindow;

    @FindBy(xpath = "//LABEL[text()='Nazwa systemowa']/../../../div[3]/div[2]/div[1]/div/div/div[2]/div/div[3]/div[2]")
    private WebElement saveProgrammingRule;


    public FormEditorRightSectionBar(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public Types types() {
        return type;
    }

    //FIELD SECTION
    public void removeField() throws InterruptedException {
        systemName = driver.findElement(By.xpath("//LABEL[text()='Nazwa systemowa']/../../div[1]/span/i[2]"));
        systemName.click();

        WebElement clickOk = driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[2]/div[4]/div/div[2]/div/div/div[1]"));
        clickOk.click();
    }

    public void changeFieldLocation() {
        Select drpLocation = new Select(driver.findElement(By.id("input55")));
        List<WebElement> list = drpLocation.getOptions();
        list.size();
        drpLocation.selectByIndex(1);
    }

    //LOCATION SECTION
    public void systemName() throws InterruptedException {

        systemName = driver.findElement(By.xpath("//LABEL[text()='Nazwa systemowa']/../INPUT"));
        systemName.click();
    }

    public void changePositionUp(int amountOfClicks) {
        WebElement positionUp = driver.findElement(By.xpath("//*[@id=\'app\']/div[4]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]"));
        for (int i = 1; i <= amountOfClicks; i++) {
            positionUp.click();
        }
    }

    public void changePositionDown(int amountOfClicks) {
        WebElement positionDown = driver.findElement(By.xpath("//*[@id=\'app\']/div[4]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[1]"));
        for (int i = 1; i <= amountOfClicks; i++) {
            positionDown.click();
        }
    }

    //PROGRAMMING SECTION
    public void setProgrammingRule(String nameOfRule) {

        setProgrammingRule.click();
        ruleWindow.click();
        ruleWindow.sendKeys(nameOfRule);
        saveProgrammingRule.click();
    }

    private String adding() {
        return "references(['PoleWprowadzania1', 'PoleWprowadzania2']),\\n\" +\n" +
                "                \"calculated(({num}) => num['PoleWprowadzania1'] + num['PoleWprowadzania2'])\\n";
    }

    private String NIP() {
        return "should.beNip";
    }

    //NAME SECTION
    public void changeName(String newName) {
        // WebElement name = driver.findElement(By.xpath("//div[contains(@class, 'uniqueName-label text')]/input"));
        WebElement name = driver.findElement(By.xpath("//div[contains(@class, 'field-block field-name')]/div/input"));
        name.clear();
        name.sendKeys(newName);
    }

    public void giveDescription(String newDescription) {
        WebElement description = driver.findElement(By.xpath("//div[contains(@class, 'field-block field-name')]/span[2]/div/div/textarea"));
        description.sendKeys(newDescription);
    }

    //INPUT FIELD SECTION
    public void checkManyLines() {
        //   WebElement manyLines = driver.findElement(By.name("input90"));
        //  manyLines.click();
    }

    public void changeTypeOfInputField(Types type) {
        WebElement contentType = driver.findElement(By.xpath("//div[contains(@class, 'field-block field-input')]/div[2]/select"));
        Select selectType = new Select(contentType);
        selectType.selectByVisibleText(String.valueOf(type));
    }

    //MAPPING SECTION

    public void clickOnRepresentationOfTheChart() {
        WebElement representationOfTheChart = driver.findElement(By.xpath("//div[contains(@class, 'field-block field-mapping')]/div[2]"));
        if (representationOfTheChart.isDisplayed()) {
            representationOfTheChart.click();
        }

    }

    //CHOICE FIELD
    public void changeTypeOfChoiceField(int i) {
        Select type = new Select(driver.findElement(By.xpath("//div[contains(@class, 'field-block field-section')]/div/div/select")));
        List<WebElement> list = type.getOptions();
        list.size();
        type.selectByIndex(i);
    }

    public String[] internalDictionary() throws InterruptedException {
        WebElement radioButtonInternal = driver.findElement(By.xpath("//div[contains(@class, 'radio-group--inline')]/div/input"));
        WebElement changeDatas = driver.findElement(By.xpath("//*[@id=\'app\']/div[4]/div[2]/div[3]/div/div[1]/div[5]/div[2]/div[2]/div[2]/div/button"));
        if (radioButtonInternal.isSelected()) {
            changeDatas.click();
            WebElement table = driver.findElement(By.xpath("//table[contains(@class, 'dictionary-edit__table')]/tbody"));
            String[] keys = {"PL", "BE", "ES", "DE"};
            String[] names = {"Polska", "Belgia", "Hiszpania", "Niemcy"};
            WebElement keyName;

            for (int i = 1; i <= keys.length; i++) {

                keyName = table.findElement(By.xpath("tr[" + i + "]/td[2]/div/input"));
                WebElement name = table.findElement(By.xpath("tr[" + i + "]/td[3]/div/input"));
                keyName.clear();
                keyName.sendKeys(keys[i-1]);
                name.clear();
                name.sendKeys(names[i-1]);
            }
            WebElement confirm = driver.findElement(By.xpath("//div[contains(@class, 'modal-buttons-actions')]/div[2]/button"));
            confirm.click();
            Thread.sleep(3000);

            } else{
                System.out.println("No");

            }
        return names;

        }
    }
