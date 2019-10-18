package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.objects.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    BasePage basePage;
    LoginForm loginForm;
    BasePage2 basePage2;
    FillingField fillingField;
    NavBar2 navBar2;
    @BeforeMethod
    public void setUp() {

        driver = DriverManager.getWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://formeditordev.z6.web.core.windows.net/");
        // basePage = new BasePage(driver);
        loginForm = new LoginForm(driver);
        basePage2 = new BasePage2(driver);
        fillingField = new FillingField(driver);
        navBar2 = new NavBar2(driver);
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.disposeDriver();
    }
}
