package page.objects;

import org.openqa.selenium.WebDriver;

public class BasePage {
    private WebDriver webDriver;
    private NavBar navBar;


    public BasePage(WebDriver driver) {
    }

    public NavBar getNavBar() {
        return navBar;
    }
}
