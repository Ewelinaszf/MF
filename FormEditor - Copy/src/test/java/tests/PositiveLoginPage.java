package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PositiveLoginPage extends BaseTest {
    //WebDriver driver;
    @FindBy(xpath = "//*[@id=\'home-page\']/div/div[1]/span")
    private WebElement createNewForm;

    //    @FindBy(xpath = "//*[@id='home-page'/div[1]/div/div[2]/div/input")
//    private WebElement nameOfNewForm;
    public PositiveLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PositiveLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains@class,'btn btn-secondary')]")
    private WebElement logOut;

    @Test
    public void openForm() throws InterruptedException {


        loginForm.createNewForm();
        basePage2.addInputField();
        basePage2.addInputField();
        basePage2.addInputField();

        basePage2.changeTypeOfInputField(1);

        basePage2.changeTypeOfInputField(2);
        basePage2.changeTypeOfInputField(3);


        basePage2.setProgrammingRule(3);
        Thread.sleep(2000);
        navBar2.goToFillingField();

        int a = fillingField.enterValue(1);

        int b = fillingField.enterValue(2);
        WebElement fillingField3 = fillingField.findField(3);
        fillingField3.click();
        String textFromField3 = fillingField3.getAttribute("value");
        System.out.println("c = "+textFromField3);
        System.out.println("a= "+a+" , b="+b);
        int c = Integer.valueOf(textFromField3);
        assertEquals(a+b, c);
        Thread.sleep(5000);
    }
}
