package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBar2 {
    @FindBy(id="preview")
    private WebElement filling;
    WebDriver driver;
    public NavBar2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToFillingField() {

        filling.click();
    //    return new FillingField();
    }
    // public LoginForm logOut(){
    //    this.logOut.click();
    //   return new LoginForm(driver);
    //}
}
