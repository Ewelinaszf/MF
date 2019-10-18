package page.objects;

import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class LoginForm {
    private WebDriver driver;

    @FindBy(xpath = "//*[text()='Utwórz nowy formularz']")
    private WebElement createNewForm;

    @FindBy(xpath="//input[@type='text']")
    private WebElement PIT_37;

    @FindBy(xpath="//button[contains(@class,'button')]")
    private WebElement confirm;

    public LoginForm(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void createNewForm() {
        createNewForm.click();
        //Thread.sleep(4000);
        PIT_37.sendKeys(generateName());
        confirm.click();
    }

    public String generateName() {
        Random r = new Random();
        int number = r.nextInt(99);
        String name = "PIT-"+String.valueOf(number);
        return name;
    }
}
