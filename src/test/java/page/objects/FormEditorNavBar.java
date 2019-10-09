package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormEditorNavBar extends HomePage {

    private static String fileName = "src\\file\\chromedriver.exe";
    private HomePage homePage;
    private FormEditor formEditor;
    private FillingField fillingField;
    @FindBy(id="app")
    private WebElement homeIcon;

    @FindBy(id = "edit")
    private WebElement formEditorIcon;

    @FindBy(id="preview")
    private WebElement fillingFieldIcon;


    public FormEditorNavBar(WebDriver driver, HomePage homePage) {
        super(driver);
        this.homePage = homePage;
    }


    public HomePage goHome(){
        homeIcon.click();
        return this.homePage;
    }

    public void loadXSD(){
        String filePath = "C:\\FormEditor-Selenium\\schemat.xsd";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'editor-upload-file')]//../div[1]/input")));
        driver.findElement(By.xpath("//input[1]")).sendKeys(filePath);

    }

    public FormEditor openFormEditor() {
        formEditorIcon.click();
        return this.formEditor;
    }

    public FillingField openFillingField() throws InterruptedException {
        fillingFieldIcon.click();
        return new FillingField(this.driver);
    }

    public void saveFormEditor() throws InterruptedException {
        Thread.sleep(3000);
        WebElement download = driver.findElement(By.xpath("//*[@id=\'save-btn\']/div/button"));
        download.click();
        Thread.sleep(3000);

    }

}
