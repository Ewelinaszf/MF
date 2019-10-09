package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class FillingFieldMainSection extends FormEditor{
    public FillingFieldMainSection(WebDriver driver) {
        super(driver);
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

    public void checkCheckbox(int choiceField) throws InterruptedException {
        List<WebElement> checkboxesAmount =  driver.findElements(By.xpath(("//legend[contains(text(), 'Pole wyboru 1')]/../div/div")));
        System.out.println("Size = "+checkboxesAmount.size());
        for (int i = 1; i <= checkboxesAmount.size() ; i++) {
            driver.findElement(By.xpath("//legend[contains(text(), 'Pole wyboru "+choiceField+"')]/../div[1]/div["+i+"]/label[1]/span[2]")).click();

        }

    }
}
