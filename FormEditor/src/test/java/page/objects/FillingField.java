package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class FillingField {
    private WebDriver driver;
    private NavBar2 navBar2;

    public FillingField(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement findField(int i) {

        WebElement inputField = driver.findElement(By.xpath("//span[contains(text(),'Pole wprowadzania " + i + "')]/../span[2]/input"));
        return inputField;
    }

    public int enterValue(int i) {
        WebElement inputField = findField(i);
        int num = generateNumber();
        inputField.sendKeys(Integer.toString(num));
        return num;
    }

    public int generateNumber() {
        Random r = new Random();
        int number = r.nextInt(99);
        return number;
    }


}
