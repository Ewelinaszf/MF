package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavBar {

    @FindBy(xpath =  "//button[contains@class,'btn btn-secondary')]")
    private WebElement logOut;

   // public LoginForm logOut(){
    //    this.logOut.click();
     //   return new LoginForm(driver);
    //}
}
